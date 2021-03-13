package edu.fiuba.algo3.vista.contenedores;


import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.vista.botones.BotonReiniciar;
import edu.fiuba.algo3.vista.botones.BotoneraMovimientos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class ContenedorCentral extends HBox {

    private Tablero tablero;

    public ContenedorCentral(AlgoBlocks algoBlocks, Algoritmo algoritmo, ContenedorAlgoritmo contenedorAlgoritmo){


        tablero = new Tablero();

        StackPane contenedorTablero = new StackPane(tablero);
        contenedorTablero.setStyle("-fx-background-color: white");

        ScrollPane tableroScrollable = new ScrollPane(contenedorTablero);
        tableroScrollable.setMaxSize(700, 400);
        tableroScrollable.setMinSize(700, 400);


        BotonReiniciar reiniciar = new BotonReiniciar(algoBlocks, algoritmo, tablero.obtenerVistaTablero());

        BotoneraMovimientos botonera = new BotoneraMovimientos(algoBlocks, contenedorAlgoritmo, algoritmo);
        ScrollPane scrollable = new ScrollPane(botonera);

        this.getChildren().addAll(scrollable, tableroScrollable, reiniciar);
        this.setSpacing(20);

    }

    public Tablero obtenerSectorTablero(){
        return tablero;
    }
}
