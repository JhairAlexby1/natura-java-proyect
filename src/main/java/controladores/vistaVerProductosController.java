package controladores;

import clases.Maquillaje;
import clases.Pedido;
import clases.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class vistaVerProductosController {

    @FXML
    private TableView<Producto> tablaProductos;

    @FXML
    private TableColumn<Producto, String> columnaNombre;

    @FXML
    private TableColumn<Producto, Integer> columnaId;

    @FXML
    private TableColumn<Producto, Integer> columnaCantidad;

    public void initialize() {
    columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    columnaId.setCellValueFactory(new PropertyValueFactory<>("id"));
    columnaCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

    Pedido pedido = new Pedido();
    Producto producto1 = new Producto(1, "Maquillaje", "Avon");
    Producto producto2 = new Producto(1 ,"Perfume" , "Natura");
    pedido.agregarProducto(producto1);
    pedido.agregarProducto(producto2);

    ObservableList<Producto> productos = FXCollections.observableArrayList(pedido.getProductos());

    tablaProductos.setItems(productos);
}

    public void regresar(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/vistaProductosNatura.fxml"));

            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}