package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class BotonBajarLapizEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;


    public BotonBajarLapizEventHandler(AlgoBlocks algoBlocks){

        this.algoBlocks = algoBlocks;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        algoBlocks.agregarLapizAbajo();
    }
}
