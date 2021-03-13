package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.bloques.BloqueRepetir;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class BotonRepetirDosVecesEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;


    public BotonRepetirDosVecesEventHandler(AlgoBlocks algoBlocks){

        this.algoBlocks = algoBlocks;

    }


    @Override
    public void handle(ActionEvent actionEvent) {

        BloqueRepetir repetir = algoBlocks.agregarBloqueRepetirDosVeces();
        repetir.agregarBloque(algoBlocks);
    }
}
