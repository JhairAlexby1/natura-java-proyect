package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class vistaPrincipalController {

    @FXML
    void btnAgregar(ActionEvent event) {
        try {
            // Cargar el archivo FXML del formulario
            Parent formulario = FXMLLoader.load(getClass().getResource("/vistas/vistaFormulario.fxml"));

            // Crear una nueva escena con el formulario cargado
            Scene sceneFormulario = new Scene(formulario);

            // Obtener el escenario actual y establecer la nueva escena
            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.setScene(sceneFormulario);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
void btnBuscar(ActionEvent event) {
    try {
        // Cargar el archivo FXML de la vista de búsqueda
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vistas/vistaBuscar.fxml"));
        Parent buscarViewRoot = fxmlLoader.load();

        // Obtener el escenario actual y establecer la nueva escena
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(buscarViewRoot, 600, 400));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @FXML
    void btnEditar(ActionEvent event) {

    }
}