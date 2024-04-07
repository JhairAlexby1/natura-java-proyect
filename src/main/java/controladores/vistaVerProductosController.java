package controladores;

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
        // Inicializar las columnas de la tabla
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnaCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

        // Obtener los productos del pedido
        Pedido pedido = new Pedido();
        ObservableList<Producto> productos = FXCollections.observableArrayList(pedido.getProductos());

        // Cargar los productos en la tabla
        tablaProductos.setItems(productos);
    }

    public void regresar(ActionEvent actionEvent) {
        try {
            // Cargar el archivo FXML
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/vistaProductosNatura.fxml"));

            // Obtener el escenario actual y establecer la nueva escena
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}