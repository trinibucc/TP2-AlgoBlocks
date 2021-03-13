package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonRepetirDosVecesEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonRepetirDosVeces extends Button {

    public BotonRepetirDosVeces(AlgoBlocks algoBlocks) {
        this.setText("Repetir X2");
        this.setPrefSize(100, 30);
        this.setEffect(new InnerShadow());
        this.setOnAction(new BotonRepetirDosVecesEventHandler(algoBlocks));
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
