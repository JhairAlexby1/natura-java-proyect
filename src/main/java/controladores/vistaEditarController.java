package controladores;

import clases.Consultor;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class vistaEditarController {

    @FXML
    private TableColumn<Consultor, String> idApellidoMaterni;

    @FXML
    private TableColumn<Consultor, String> idApellidoPaterno;

    @FXML
    private TableColumn<Consultor, String> idDireccion;

    @FXML
    private TableColumn<Consultor, String> idEmail;

    @FXML
    private TableColumn<Consultor, String> idNombre;

    @FXML
    private TableColumn<Consultor, String> idTelefono;

}