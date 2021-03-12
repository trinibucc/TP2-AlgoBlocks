package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controladores.BotonRepetirTresVecesEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonRepetirTresVeces extends Button {

    public BotonRepetirTresVeces(AlgoBlocks algoBlocks) {
        this.setText("Repetir X3");
        this.setPrefSize(100, 30);
        this.setOnAction(new BotonRepetirTresVecesEventHandler(algoBlocks));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
