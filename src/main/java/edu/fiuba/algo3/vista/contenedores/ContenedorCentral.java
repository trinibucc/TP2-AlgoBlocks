package edu.fiuba.algo3.vista.contenedores;


import edu.fiuba.algo3.vista.botones.BotonReiniciar;
import edu.fiuba.algo3.vista.botones.BotoneraMovimientos;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class ContenedorCentral extends HBox {

    private Tablero sectorTablero;

    public ContenedorCentral(AlgoBlocks algoBlocks, Algoritmo algoritmo, ContenedorAlgoritmo contenedorAlgoritmo){


        ContenedorLapiz lapiz = new ContenedorLapiz();
        sectorTablero = new Tablero(lapiz);

        Pane contenedorTablero = new Pane(lapiz, sectorTablero);
        contenedorTablero.setStyle("-fx-background-color: white");

        ScrollPane tableroScrollable = new ScrollPane(contenedorTablero);

        BotonReiniciar reiniciar = new BotonReiniciar(algoBlocks, algoritmo, sectorTablero.obtenerVistaTablero());

        BotoneraMovimientos botonera = new BotoneraMovimientos(algoBlocks, contenedorAlgoritmo, algoritmo);
        ScrollPane scrollable = new ScrollPane(botonera);

        this.getChildren().addAll(scrollable, tableroScrollable, reiniciar);
        this.setSpacing(20);

    }

    public Tablero obtenerSectorTablero(){
        return sectorTablero;
    }
}
