package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonArribaEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;

    public BotonArribaEventHandler(AlgoBlocks algoBlocks){
        this.algoBlocks = algoBlocks;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoBlocks.agregarBloqueArriba();
    }
}
