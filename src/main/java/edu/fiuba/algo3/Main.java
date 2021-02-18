package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;





public class Main extends Application {

    @Override
    public void start(Stage stage) {

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

        stage.setTitle("AlgoBlocks");
        stage.setHeight(600);
        stage.setWidth(750);
        stage.setResizable(false);

        /*Image imagen = new Image("file:/home/trinidad/Escritorio/flechas2.jpg");
        ImageView fondo = new ImageView(imagen);
        fondo.setImage(imagen);
        fondo.setFitHeight(600);
        fondo.setFitWidth(750);*/

        Label titulo = new Label();
        titulo.setText("ALGOBLOCKS");
        titulo.setPadding(new Insets(20));

        TextField nombre = new TextField();
        nombre.setPromptText("Ingrese el nombre");

        Button ejecutar = new Button("EJECUTAR");
        ejecutar.setPadding(new Insets(20));

        Button guardar = new Button("GUARDAR");
        Button derecha = new Button("Derecha");
        Button izquierda = new Button("Izquierda");
        Button arriba = new Button("Arriba");
        Button abajo = new Button("Abajo");
        Button subirLapiz = new Button("Subir lapiz");
        Button bajarLapiz = new Button("Bajar lapiz");
        Button repetir2veces = new Button("Repetir X2");
        Button repetir3veces = new Button("Repetir X3");
        Button invertir = new Button("Invertir");
        //Button personalizado = new Button("Personalizado");

        HBox contenedorGuardar = new HBox(guardar, nombre);
        contenedorGuardar.setSpacing(10);
        contenedorGuardar.setPadding(new Insets(20));

        HBox contenedorSuperior = new HBox(contenedorGuardar, titulo);
        contenedorSuperior.setSpacing(30);

        VBox vbox = new VBox(derecha, izquierda, arriba, abajo, subirLapiz, bajarLapiz,
                repetir2veces, repetir3veces, invertir);
        vbox.setSpacing (10);
        vbox.setPadding(new Insets(20));

        HBox contenedorCentral = new HBox(vbox, lineChart);

        VBox contenedorVertical = new VBox(contenedorSuperior, contenedorCentral);

        StackPane contenedorPrincipal = new StackPane();
        //contenedorPrincipal.getChildren().add(fondo);
        contenedorPrincipal.getChildren().add(contenedorVertical);
        contenedorPrincipal.setAlignment(ejecutar, Pos.BOTTOM_CENTER);
        contenedorPrincipal.getChildren().add(ejecutar);


        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);

        BajarLapiz bloqueBajarLapiz = new BajarLapiz(algoBlocks);
        bajarLapiz.setOnAction(bloqueBajarLapiz);

        RepetirDosVeces iterar2veces = new RepetirDosVeces(algoBlocks);
        repetir2veces.setOnAction(iterar2veces);

        Scene scene = new Scene(contenedorPrincipal, 750, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}