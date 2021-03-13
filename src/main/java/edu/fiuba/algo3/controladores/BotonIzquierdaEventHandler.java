package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonIzquierdaEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;

    public BotonIzquierdaEventHandler(AlgoBlocks algoBlocks){

        this.algoBlocks = algoBlocks;

    }


    @Override
    public void handle(ActionEvent actionEvent) {

        algoBlocks.agregarBloqueIzquierda();

    }
}
