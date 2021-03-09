package edu.fiuba.algo3.Vista.Contenedores;


import edu.fiuba.algo3.Botones.BotonReiniciar;
import edu.fiuba.algo3.Botones.BotoneraMovimientos;
import edu.fiuba.algo3.Vista.CreadorSectorTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class ContenedorCentral extends HBox {

    private CreadorSectorTablero sectorTablero;

    public ContenedorCentral(AlgoBlocks algoBlocks, Algoritmo algoritmo, ContenedorAlgoritmo contenedorAlgoritmo){



        ContenedorLapiz lapiz = new ContenedorLapiz();
        sectorTablero = new CreadorSectorTablero(lapiz);
        Pane contenedorTablero = new Pane(lapiz, sectorTablero);
        contenedorTablero.setStyle("-fx-background-color: white");
        Scrollable tableroScrollable = new Scrollable(contenedorTablero);

        BotonReiniciar reiniciar = new BotonReiniciar(algoBlocks, algoritmo);

        BotoneraMovimientos botonera = new BotoneraMovimientos(algoBlocks, contenedorAlgoritmo);
        Scrollable scrollable = new Scrollable(botonera);
        this.getChildren().addAll(scrollable, tableroScrollable, reiniciar);
        this.setSpacing(20);
        //this.setPadding(new Insets(20));

    }

    public CreadorSectorTablero obtenerSectorTablero(){
        return sectorTablero;
    }
}
