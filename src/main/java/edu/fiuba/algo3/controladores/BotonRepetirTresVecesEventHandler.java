package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.bloques.BloqueRepetir;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRepetirTresVecesEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;


    public BotonRepetirTresVecesEventHandler(AlgoBlocks algoBlocks){

        this.algoBlocks = algoBlocks;
    }


    @Override
    public void handle(ActionEvent actionEvent) {

        BloqueRepetir repetir = algoBlocks.agregarBloqueRepetirTresVeces();
        repetir.agregarBloque(algoBlocks);

    }
}
