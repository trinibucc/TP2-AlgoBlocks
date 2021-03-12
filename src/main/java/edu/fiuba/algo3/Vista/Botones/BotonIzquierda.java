package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controladores.BotonIzquierdaEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonIzquierda extends Button {

    public BotonIzquierda(AlgoBlocks algoBlocks){
        this.setText("Izquierda");
        this.setPrefSize(100, 30);
        this.setOnAction(new BotonIzquierdaEventHandler(algoBlocks));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
