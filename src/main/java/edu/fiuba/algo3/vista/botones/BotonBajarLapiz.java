package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonBajarLapizEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;


public class BotonBajarLapiz extends Button {

    public BotonBajarLapiz(AlgoBlocks algoBlocks) {
        this.setText("Bajar lapiz");
        this.setPrefSize(100, 30);
        this.setOnAction(new BotonBajarLapizEventHandler(algoBlocks));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
