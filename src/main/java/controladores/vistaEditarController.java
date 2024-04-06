package controladores;

import clases.Consultor;
import clases.GestionConsultores;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class vistaEditarController {

    private GestionConsultores gestionConsultores;

    @FXML
    private TableView<Consultor> tableView;

    @FXML
    private TableColumn<Consultor, String> nombreColumn;

    @FXML
    private TableColumn<Consultor, String> apellidoPaternoColumn;

    @FXML
    private TableColumn<Consultor, String> apellidoMaternoColumn;

    @FXML
    private TableColumn<Consultor, String> telefonoColumn;

    @FXML
    private TableColumn<Consultor, String> direccionColumn;

    public vistaEditarController() {
        this.gestionConsultores = new GestionConsultores();
        // Aquí puedes cargar los consultores en la TableView
    }

    @FXML
    void handleTableClick(MouseEvent event) {
        if (event.getClickCount() == 2) { // Doble clic
            // Aquí puedes obtener el consultor seleccionado y abrir la ventana de edición
            Consultor consultorSeleccionado = tableView.getSelectionModel().getSelectedItem();
            // Abre la ventana de edición con el consultorSeleccionado
        }
    }

    // Aquí puedes agregar métodos para agregar, eliminar y actualizar consultores usando gestionConsultores
}