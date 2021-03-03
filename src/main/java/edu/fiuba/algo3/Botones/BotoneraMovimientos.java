package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class BotoneraMovimientos extends VBox {

    public BotoneraMovimientos(AlgoBlocks algoBlocks){
        BotonDerecha botonDerecha = new BotonDerecha(algoBlocks);
        BotonIzquierda botonIzquierda = new BotonIzquierda(algoBlocks);
        BotonArriba botonArriba = new BotonArriba(algoBlocks);
        BotonAbajo botonAbajo = new BotonAbajo(algoBlocks);
        BotonRepetirDosVeces repetirDosVeces = new BotonRepetirDosVeces(algoBlocks);
        BotonRepetirTresVeces repetirTresVeces = new BotonRepetirTresVeces(algoBlocks);
        BotonInvertir invertir = new BotonInvertir(algoBlocks);
        BotonBajarLapiz bajarLapiz = new BotonBajarLapiz(algoBlocks);
        BotonSubirLapiz subirLapiz = new BotonSubirLapiz(algoBlocks);

        this.getChildren().addAll(botonDerecha, botonIzquierda, botonArriba, botonAbajo, repetirDosVeces,
                repetirTresVeces, invertir, bajarLapiz, subirLapiz);
        this.setPadding(new Insets(20));
        this.setSpacing(10);

    }


}
