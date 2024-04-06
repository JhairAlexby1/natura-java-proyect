package controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import clases.Consultor;

import java.util.ArrayList;

public class vistaEditarController {

    @FXML
    private TableView<Consultor> tablaRegistro;
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
    @FXML
    private Button btnRegresar;

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellidoPaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
        colApellidoMaterno.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        ArrayList<Consultor> listaConsultores = Consultor.getConsultores();
        ObservableList<Consultor> observableList = FXCollections.observableArrayList(listaConsultores);
        tablaRegistro.setItems(observableList);
    }
}