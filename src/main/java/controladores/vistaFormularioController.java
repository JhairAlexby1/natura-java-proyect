package controladores;

import clases.Consultor;
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
    void btnAgregar(ActionEvent event) {
        String idConsultor = id.getText();
        String nombreConsultor = nombre.getText();
        String apellidoPaternoConsultor = apellidoPaterno.getText();
        String apellidoMaternoConsultor = apellidoMaterno.getText();
        String emailConsultor = emailField.getText();
        String passwordConsultor = passwordField.getText();
        String telefonoConsultor = telefonoField.getText();
        String direccionConsultor = ""; // Aquí debes obtener la dirección del formulario

        // Asegúrate de que los campos de contraseña coincidan
        if (!passwordConsultor.equals(confirmPasswordField.getText())) {
            System.out.println("Las contraseñas no coinciden");
            return;
        }

        // Crea una nueva instancia de Consultor
        Consultor nuevoConsultor = new Consultor(idConsultor, nombreConsultor, apellidoPaternoConsultor, apellidoMaternoConsultor, telefonoConsultor, direccionConsultor, emailConsultor, passwordConsultor);

        // Muestra todos los consultores
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