package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonSubirLapizEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonSubirLapiz extends Button {

    public BotonSubirLapiz(AlgoBlocks algoBlocks) {

        this.setText("Subir lapiz");
        this.setPrefSize(100, 30);
        this.setEffect(new InnerShadow());
        this.setOnAction(new BotonSubirLapizEventHandler(algoBlocks));
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }
}
