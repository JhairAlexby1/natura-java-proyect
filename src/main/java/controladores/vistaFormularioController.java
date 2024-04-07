package controladores;

import clases.Consultor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class vistaFormularioController {

    @FXML
    private TextField apellidoMaterno;

    @FXML
    private TextField apellidoPaterno;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField id;

    @FXML
    private TextField nombre;

    @FXML
    private PasswordField passwordField;

    @FXML
    //esto sirve para que los campos de texto solo acepten letras y no números, para que no haya errores al ingresar datos
    public void initialize() {
        nombre.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\D*")) {
                nombre.setText(newValue.replaceAll("[^\\D]", ""));
            }
        });

        apellidoMaterno.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\D*")) {
                apellidoMaterno.setText(newValue.replaceAll("[^\\D]", ""));
            }
        });

        apellidoPaterno.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\D*")) {
                apellidoPaterno.setText(newValue.replaceAll("[^\\D]", ""));
            }
        });

        telefonoField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                telefonoField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
    }

    // esto sirve para mostrar una alerta en caso de que haya campos vacíos
    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    void btnAgregar(ActionEvent event) {
        String idConsultor = id.getText();
        String nombreConsultor = nombre.getText();
        String apellidoPaternoConsultor = apellidoPaterno.getText();
        String apellidoMaternoConsultor = apellidoMaterno.getText();
        String emailConsultor = emailField.getText();
        String passwordConsultor = passwordField.getText();
        String telefonoConsultor = telefonoField.getText();
        String direccionConsultor = "";

        if (idConsultor.isEmpty() || nombreConsultor.isEmpty() || apellidoPaternoConsultor.isEmpty() || apellidoMaternoConsultor.isEmpty() || emailConsultor.isEmpty() || passwordConsultor.isEmpty() || telefonoConsultor.isEmpty()) {
            showAlert("Campos vacíos", "Por favor, llena todos los campos", "Todos los campos deben estar llenos para continuar.");
            return;
        }

        if (!passwordConsultor.equals(confirmPasswordField.getText())) {
            showAlert("Contraseñas no coinciden", "Por favor, verifica las contraseñas", "Las contraseñas ingresadas no coinciden.");
            return;
        }

        Consultor nuevoConsultor = new Consultor(idConsultor, nombreConsultor, apellidoPaternoConsultor, apellidoMaternoConsultor, telefonoConsultor, direccionConsultor, emailConsultor, passwordConsultor);

        System.out.println(Consultor.getConsultores());

        System.out.println("Consultor agregado");
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