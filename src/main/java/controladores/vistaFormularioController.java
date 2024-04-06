package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class vistaFormularioController {

    @FXML
    private TextField nombre;

    @FXML
    private TextField apellidoPaterno;

    @FXML
    private TextField apellidoMaterno;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button submitButton;

    @FXML
    void handleSubmitButtonAction(ActionEvent event) {
        System.out.println("Nombre: " + nombre.getText());
        System.out.println("Apellido Paterno: " + apellidoPaterno.getText());
        System.out.println("Apellido Materno: " + apellidoMaterno.getText());
        System.out.println("Email: " + emailField.getText());
        System.out.println("Password: " + passwordField.getText());
        System.out.println("Confirm Password: " + confirmPasswordField.getText());
    }
}