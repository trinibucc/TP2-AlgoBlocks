package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.BloqueRepetir;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Invertir implements EventHandler<ActionEvent>{

    private AlgoBlocks algoBlocks;

    public Invertir(AlgoBlocks algoBlocks){
            this.algoBlocks = algoBlocks;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueRepetir repetir = algoBlocks.agregarBloqueRepetirTresVeces();
        repetir.agregarBloque(algoBlocks);
    }

}
