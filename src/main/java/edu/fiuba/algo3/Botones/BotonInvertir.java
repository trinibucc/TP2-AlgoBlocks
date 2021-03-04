package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonInvertirEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonInvertir extends Button {

    public BotonInvertir(AlgoBlocks algoBlocks) {
        this.setText("Invertir");
        this.setOnAction(new BotonInvertirEventHandler(algoBlocks));
    }
}