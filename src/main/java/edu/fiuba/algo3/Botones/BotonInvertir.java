package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonInvertirEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonInvertir extends Button {

    public BotonInvertir(AlgoBlocks algoBlocks) {
        this.setText("Invertir");
        this.setOnAction(new BotonInvertirEventHandler(algoBlocks));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
