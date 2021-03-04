package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonSubirLapiz extends Button {

    public BotonSubirLapiz(AlgoBlocks algoBlocks) {

        this.setText("Subir lapiz");
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }
}
