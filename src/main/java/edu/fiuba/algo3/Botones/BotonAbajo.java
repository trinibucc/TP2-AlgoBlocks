package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonAbajo extends Button {

    public BotonAbajo(AlgoBlocks algoBlocks) {
        this.setText("Abajo");
        this.setOnAction(new MoverAbajo(algoBlocks));
    }
}
