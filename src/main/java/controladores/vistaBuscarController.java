package controladores;

import clases.Consultor;
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
   // Método para buscar un consultor por nombre o ID
void buscarConsultor(ActionEvent event) {
    String searchTerm = searchField.getText().trim();
    if (searchTerm.isEmpty()) {
        resultsArea.setText("Por favor, ingresa un nombre o ID para buscar.");
        return;
    }

    StringBuilder results = new StringBuilder();
    for (Consultor consultor : Consultor.getConsultores()) {
        if (consultor.getNombre().equalsIgnoreCase(searchTerm) || consultor.getId().equals(searchTerm)) {
            results.append(consultor.toString()).append("\n");
        }
    }

    if (results.length() == 0) {
        resultsArea.setText("No se encontraron consultores con el nombre o ID proporcionado.");
    } else {
        resultsArea.setText(results.toString());
    }
}

    }
