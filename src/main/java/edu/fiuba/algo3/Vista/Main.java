package edu.fiuba.algo3.Vista;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) {


        stage.setTitle("AlgoBlocks");
        stage.setHeight(700);
        stage.setWidth(800);

        Juego juego = new Juego();
        GridPane stackPane = juego.crearVentanPrincipal();


        Scene scene = new Scene(stackPane, 800, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}