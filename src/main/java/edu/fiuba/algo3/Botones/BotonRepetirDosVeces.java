package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonRepetirDosVecesEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonRepetirDosVeces extends Button {

    public BotonRepetirDosVeces(AlgoBlocks algoBlocks) {
        this.setText("Repetir X2");
        this.setOnAction(new BotonRepetirDosVecesEventHandler(algoBlocks));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
