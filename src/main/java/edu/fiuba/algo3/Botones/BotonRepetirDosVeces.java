package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Botones.EventHandler.RepetirDosVeces;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonRepetirDosVeces extends Button {

    public BotonRepetirDosVeces(AlgoBlocks algoBlocks) {
        this.setText("Repetir X2");
        this.setOnAction(new RepetirDosVeces(algoBlocks));
    }
}
