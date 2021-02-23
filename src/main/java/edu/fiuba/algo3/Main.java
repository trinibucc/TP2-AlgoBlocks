package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;





public class Main extends Application {


    @Override
    public void start(Stage stage) {


        stage.setTitle("AlgoBlocks");
        stage.setHeight(700);
        stage.setWidth(800);

        Juego juego = new Juego();
        Image imagen = new Image("fondo.jpg");
        ImageView imageView = new ImageView(imagen);
        imageView.setFitHeight(700);
        imageView.setFitWidth(800);

        VBox vbox = juego.crearVentana();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(imageView);
        stackPane.getChildren().add(vbox);


        Scene scene = new Scene(stackPane, 800, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}