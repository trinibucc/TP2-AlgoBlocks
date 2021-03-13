package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonAbajoEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;


public class BotonAbajo extends Button {



    public BotonAbajo(AlgoBlocks algoBlocks) {

        this.setText("Abajo");
        this.setPrefSize(100, 30);
        this.setEffect(new InnerShadow());
        this.setOnAction(new BotonAbajoEventHandler(algoBlocks));
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }

}
