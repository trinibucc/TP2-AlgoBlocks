package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Botones.EventHandler.MoverArriba;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonArriba extends Button {

    public BotonArriba(AlgoBlocks algoBlocks) {
        this.setText("Arriba");
        this.setOnAction(new MoverArriba(algoBlocks));
    }
}
