package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonRepetirTresVeces extends Button {

    public BotonRepetirTresVeces(AlgoBlocks algoBlocks) {
        this.setText("Repetir X3");
        this.setOnAction(new RepetirTresVeces(algoBlocks));
    }
}
