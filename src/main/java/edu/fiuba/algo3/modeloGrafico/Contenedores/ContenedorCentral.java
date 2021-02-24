package edu.fiuba.algo3.modeloGrafico.Contenedores;


import edu.fiuba.algo3.Botones.BotonReiniciar;
import edu.fiuba.algo3.Botones.BotoneraMovimientos;
import edu.fiuba.algo3.Vista.CreadorSectorTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.layout.HBox;


public class ContenedorCentral extends HBox {

    private CreadorSectorTablero sectorTablero;

    public ContenedorCentral(AlgoBlocks algoBlocks, Algoritmo algoritmo){

        sectorTablero = new CreadorSectorTablero();

        BotonReiniciar reiniciar = new BotonReiniciar(algoBlocks, algoritmo);

        BotoneraMovimientos botonera = new BotoneraMovimientos(algoBlocks);

        this.getChildren().addAll(botonera, sectorTablero, reiniciar);
        this.setSpacing(20);
        //this.setPadding(new Insets(20));

    }

    public CreadorSectorTablero obtenerSectorTablero(){
        return sectorTablero;
    }
}
