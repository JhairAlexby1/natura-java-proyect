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
    String direccionConsultor = "";

    // Verifica si todos los campos están llenos
    if (idConsultor.isEmpty() || nombreConsultor.isEmpty() || apellidoPaternoConsultor.isEmpty() || apellidoMaternoConsultor.isEmpty() || emailConsultor.isEmpty() || passwordConsultor.isEmpty() || telefonoConsultor.isEmpty()) {
        System.out.println("Por favor, llena todos los campos del formulario.");
        return;
    }

    if (!passwordConsultor.equals(confirmPasswordField.getText())) {
        System.out.println("Las contraseñas no coinciden");
        return;
    }

    Consultor nuevoConsultor = new Consultor(idConsultor, nombreConsultor, apellidoPaternoConsultor, apellidoMaternoConsultor, telefonoConsultor, direccionConsultor, emailConsultor, passwordConsultor);

    // Muestra todos los consultores en terminal para ver que si funciona
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