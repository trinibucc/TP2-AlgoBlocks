package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.bloques.BloqueInverso;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class BotonInvertirEventHandler implements EventHandler<ActionEvent>{

    private AlgoBlocks algoBlocks;


    public BotonInvertirEventHandler(AlgoBlocks algoBlocks){

            this.algoBlocks = algoBlocks;
    }


    @Override
    public void handle(ActionEvent actionEvent) {

        BloqueInverso inverso = algoBlocks.agregarBloqueInverso();
        inverso.agregarBloque(algoBlocks);
    }

}
