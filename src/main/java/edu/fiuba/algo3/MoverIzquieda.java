package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverIzquieda implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;

    public MoverIzquieda(AlgoBlocks algoBlocks){
        this.algoBlocks = algoBlocks;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        algoBlocks.agregarBloqueIzquierda();
    }
}
