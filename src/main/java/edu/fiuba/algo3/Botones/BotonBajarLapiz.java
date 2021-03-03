package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controlador.BotonBajarLapizEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;


public class BotonBajarLapiz extends Button {

    public BotonBajarLapiz(AlgoBlocks algoBlocks) {
        this.setText("Bajar lapiz");
        this.setOnAction(new BotonBajarLapizEventHandler(algoBlocks));
    }
}
