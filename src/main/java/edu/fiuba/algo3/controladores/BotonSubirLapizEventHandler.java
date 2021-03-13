package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSubirLapizEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;


    public BotonSubirLapizEventHandler(AlgoBlocks algoBlocks) {

        this.algoBlocks = algoBlocks;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        algoBlocks.agregarLapizArriba();
    }
}
