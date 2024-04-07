package controladores;

import clases.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class vistaAgregarProductoController {

    @FXML
    private ComboBox<String> tipoProducto;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField idProducto;

    @FXML
    private TextField cantidadProducto;

    private Pedido pedido;

    public vistaAgregarProductoController() {
        this.pedido = Pedido.getInstance();
    }

    @FXML
void agregarProducto(ActionEvent event) {
    String tipo = tipoProducto.getValue();
    String nombre = nombreProducto.getText();
    int id = Integer.parseInt(idProducto.getText());
    int cantidad = Integer.parseInt(cantidadProducto.getText());

    Producto producto;

    switch (tipo) {
        case "Perfume":
            producto = new Perfume(id, tipo, nombre, cantidad);
            break;
        case "Maquillaje":
            producto = new Maquillaje(id, tipo, nombre, cantidad);
            break;
        case "Joyeria":
            producto = new Joyeria(id, tipo, nombre, cantidad);
            break;
        default:
            producto = new Producto(id, tipo, nombre);
    }

    this.pedido.agregarProducto(producto);

    // Imprimir los detalles del producto en la terminal
    System.out.println("Producto agregado: " + producto.toString());
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