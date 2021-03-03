package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controlador.BotonInvertirEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonInvertir extends Button {

    public BotonInvertir(AlgoBlocks algoBlocks) {
        this.setText("BotonInvertirEventHandler");
        this.setOnAction(new BotonInvertirEventHandler(algoBlocks));
    }
}
