package controladores;

import clases.Consultor;
import com.example.natura_proyect.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class vistaEditarController {

    public TableView<Consultor> tablaRegistro;

    @FXML
    private TableColumn<Consultor, String> colId;

    @FXML
    private TableColumn<Consultor, String> colNombre;

    @FXML
    private TableColumn<Consultor, String> colApellidoPaterno;

    @FXML
    private TableColumn<Consultor, String> colApellidoMaterno;

    @FXML
    private TableColumn<Consultor, String> colTelefono;

    @FXML
    private TableColumn<Consultor, String> colDireccion;

    @FXML
    private TableColumn<Consultor, String> colEmail;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colApellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
        this.colApellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
        this.colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        tablaRegistro.setItems(obtenerDatos());
    }

    private ObservableList<Consultor> obtenerDatos() {
        ObservableList<Consultor> lista = FXCollections.observableArrayList();
        ArrayList<Consultor> listaConsultores = Consultor.getConsultores();

        for (Consultor c: listaConsultores){
            lista.add(new Consultor(c.getId(), c.getNombre(), c.getApellidoPaterno(), c.getApellidoMaterno(), c.getTelefono(), c.getDireccion(), c.getEmail(), c.getPassword()));
        }
        return lista;
    }



    public void regresar(ActionEvent actionEvent) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vistas/vistaPrincipal.fxml"));
        Parent mainViewRoot = fxmlLoader.load();

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainViewRoot, 600, 400));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}