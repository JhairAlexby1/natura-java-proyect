package controladores;

import clases.Consultor;
import clases.GestionConsultores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class vistaBuscarController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea resultsArea;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;


    private GestionConsultores gestionConsultores;

    public vistaBuscarController() {
        this.gestionConsultores = new GestionConsultores();
    }

    @FXML
    void btnRegresar(ActionEvent event) {
        try {
            // Cargar el archivo FXML del menú principal
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vistas/vistaPrincipal.fxml"));
            Parent mainViewRoot = fxmlLoader.load();

            // Obtener el escenario actual y establecer la nueva escena
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(mainViewRoot, 600, 400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   @FXML
void buscarConsultor(ActionEvent event) {
    String id = searchField.getText();
    Consultor consultor = gestionConsultores.buscarConsultorPorId(id);
    if (consultor != null) {
        resultsArea.setText(consultor.toString());
    } else {
        resultsArea.setText("No se encontró el consultor con el ID: " + id);
    }
}

}
