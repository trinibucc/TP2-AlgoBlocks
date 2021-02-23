package edu.fiuba.algo3;

import edu.fiuba.algo3.Botones.BotonEjecutar;
import edu.fiuba.algo3.Botones.BotonReiniciar;
import edu.fiuba.algo3.Botones.BotoneraMovimientos;
import edu.fiuba.algo3.Vista.CreadorSectorTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Juego {

    Personaje personaje;
    Algoritmo algoritmo;
    AlgoBlocks algoBlocks;


    public Juego(){
        this.personaje = new Personaje();
        this.algoritmo = new Algoritmo(personaje);
        this.algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);

    }

    public VBox crearVentana(){
        Titulo ventana = new Titulo();
        Label titulo = ventana.crearTitulo();
        VBox central = crearContenedorCentral();
        VBox todo = new VBox(titulo, central);
        todo.setPadding(new Insets(20));
        return todo;
    }

    public VBox crearContenedorCentral(){
        CreadorSectorTablero creadorSectorTablero = new CreadorSectorTablero();
        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: white");
        stackPane.getChildren().add(creadorSectorTablero);
        BotonReiniciar reiniciar = new BotonReiniciar(algoBlocks, algoritmo);
        BotonEjecutar ejecutar = new BotonEjecutar(algoritmo, creadorSectorTablero.obtenerDibujador().obtenerTablero(),
                creadorSectorTablero.obtenerDibujador());
        HBox central1 = new HBox(new BotoneraMovimientos(algoBlocks), stackPane, reiniciar);
        VBox central = new VBox(central1, ejecutar);
        central.setSpacing(10);
        return central;

    }
}
