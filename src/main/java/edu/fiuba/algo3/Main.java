package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class Main extends Application {

    @Override
    public void start(Stage stage) {

        final NumberAxis xAxis = new NumberAxis(0.0, 10, 1);
        final NumberAxis yAxis = new NumberAxis(0.0, 10, 1);

        LineChart<Number, Number> tablero = new LineChart<Number, Number>(xAxis, yAxis);

        stage.setTitle("AlgoBlocks");
        stage.setHeight(700);
        stage.setWidth(800);
        stage.setResizable(false);


       /* Image imagen = new Image("fondo.jpg");
        ImageView fondo = new ImageView(imagen);
        fondo.setImage(imagen);
        fondo.setFitHeight(600);
        fondo.setFitWidth(750);*/

        Label titulo = new Label();
        titulo.setText("ALGOBLOCKS");
        titulo.setPadding(new Insets(10));
        titulo.setBackground(new Background(new BackgroundFill(Color.web("#C0C0C0"), CornerRadii.EMPTY, Insets.EMPTY)));
        titulo.setTextFill(Color.web("#FFFFFF"));
        Font auxFont = titulo.getFont();
        titulo.setFont(new Font(auxFont.getStyle(), 20));
        TextField nombre = new TextField();
        nombre.setPromptText("Ingrese el nombre");

        Button ejecutar = new Button("EJECUTAR");
        ejecutar.setLineSpacing(10);
        ejecutar.setPadding(new Insets(15));

        Button reiniciar = new Button("Reiniciar");
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
        Button terminarRepeticion = new Button("Terminar repeticion");
        //Button personalizado = new Button("Personalizado");

        HBox contenedorGuardar = new HBox(guardar, nombre);
        contenedorGuardar.setSpacing(10);
        contenedorGuardar.setPadding(new Insets(20));

        HBox contenedorSuperior = new HBox(contenedorGuardar,titulo);
        contenedorSuperior.setSpacing(30);

        VBox vbox = new VBox(derecha, izquierda, arriba, abajo, subirLapiz, bajarLapiz,
                repetir2veces, repetir3veces, terminarRepeticion, invertir);
        vbox.setSpacing (10);
        vbox.setPadding(new Insets(20));

        HBox contenedorCentral = new HBox(vbox, tablero, reiniciar);

        VBox contenedorVertical = new VBox(contenedorSuperior, contenedorCentral);

        StackPane contenedorPrincipal = new StackPane();
       // contenedorPrincipal.getChildren().add(fondo);
        contenedorPrincipal.getChildren().add(contenedorVertical);
        contenedorPrincipal.setAlignment(ejecutar, Pos.BOTTOM_CENTER);
        contenedorPrincipal.getChildren().add(ejecutar);

        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);

        BajarLapiz bloqueBajarLapiz = new BajarLapiz(algoBlocks);
        bajarLapiz.setOnAction(bloqueBajarLapiz);

        RepetirDosVeces iterar2veces = new RepetirDosVeces(algoBlocks);
        repetir2veces.setOnAction(iterar2veces);

        RepetirTresVeces iterar3veces = new RepetirTresVeces(algoBlocks);
        repetir3veces.setOnAction(iterar3veces);

        Invertir inverso = new Invertir(algoBlocks);
        invertir.setOnAction(inverso);

        MoverIzquieda moverIzquieda = new MoverIzquieda(algoBlocks);
        izquierda.setOnAction(moverIzquieda);

        Ejecutar ejecutarAlgoritmo = new Ejecutar(algoritmo, tablero);
        ejecutar.setOnAction(ejecutarAlgoritmo);

        Reiniciar reinicio = new Reiniciar(algoBlocks, algoritmo);
        reiniciar.setOnAction(reinicio);

        TerminarRepeticion terminaRepeticion = new TerminarRepeticion(algoBlocks, algoritmo);
        terminarRepeticion.setOnAction(terminaRepeticion);

        Scene scene = new Scene(contenedorPrincipal, 800, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}