package com.example.natura_proyect;

import clases.Consultor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Consultor.agregarConsultoresPrueba();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/vistas/vistaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}