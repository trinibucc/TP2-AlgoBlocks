package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonIzquierdaEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonIzquierda extends Button {

    public BotonIzquierda(AlgoBlocks algoBlocks){
        this.setText("Izquierda");
        this.setOnAction(new BotonIzquierdaEventHandler(algoBlocks));
    }
}