package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAbajoEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;

    public BotonAbajoEventHandler(AlgoBlocks algoBlocks){
        this.algoBlocks = algoBlocks;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoBlocks.agregarBloqueAbajo();
    }
}
