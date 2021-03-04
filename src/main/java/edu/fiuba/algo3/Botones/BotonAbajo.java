package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonAbajoEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;


public class BotonAbajo extends Button {



    public BotonAbajo(AlgoBlocks algoBlocks) {

        this.setText("Abajo");
        this.setOnAction(new BotonAbajoEventHandler(algoBlocks));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }

}
