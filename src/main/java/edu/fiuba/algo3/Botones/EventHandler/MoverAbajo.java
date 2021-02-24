package edu.fiuba.algo3.Botones.EventHandler;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverAbajo implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;

    public MoverAbajo(AlgoBlocks algoBlocks){
        this.algoBlocks = algoBlocks;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoBlocks.agregarBloqueAbajo();
    }
}
