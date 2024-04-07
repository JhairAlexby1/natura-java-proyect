package controladores;

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

    @FXML
    void agregarProducto(ActionEvent event) {
        // Aquí va la lógica para agregar el producto
    }
}