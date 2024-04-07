package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class vistaProductosNaturaController {

    @FXML
    void agregarProducto(ActionEvent event) {
        System.out.println("Agregando producto");
    }

    @FXML
    void btnRegresar(ActionEvent event) {
        System.out.println("Regresando al menu principal");
    }

    @FXML
    void verProductos(ActionEvent event) {
        System.out.println("Viendo productos");
    }

}
