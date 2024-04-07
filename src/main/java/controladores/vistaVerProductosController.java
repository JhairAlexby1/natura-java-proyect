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

    @FXML
    private TableColumn<Producto, String> columnaTipo;


    public void initialize() {
        columnaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        columnaCantidad.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

        Pedido pedido = Pedido.getInstance();


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