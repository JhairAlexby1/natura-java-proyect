package controladores;

import clases.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
        this.pedido = new Pedido();
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
}