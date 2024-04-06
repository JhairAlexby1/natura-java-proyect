module com.example.natura_proyect {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.natura_proyect to javafx.fxml;
    exports com.example.natura_proyect;
    exports controladores;
    opens controladores to javafx.fxml;
}