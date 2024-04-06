package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class vistaFormularioController {

    @FXML
    private TextField apeliidoMaterno;

    @FXML
    private TextField apeliidoPaterno;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nombre;

    @FXML
    private PasswordField passwordField;

    @FXML
    void btnAgregar(ActionEvent event) {
        System.out.println("agregado");

    }

    @FXML
void btnRegresar(ActionEvent event) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vistas/vistaPrincipal.fxml"));
        Parent mainViewRoot = fxmlLoader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainViewRoot, 600, 400));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
