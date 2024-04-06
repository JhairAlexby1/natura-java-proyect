package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class vistaBuscarController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea resultsArea;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    void btnRegresar(ActionEvent event) {
        System.out.println("Regresando a la vista principal");
    }

    @FXML
    void buscarConsultor(ActionEvent event) {
        System.out.println("Buscando consultor...");
    }

}
