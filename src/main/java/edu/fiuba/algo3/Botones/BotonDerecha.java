package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;

public class BotonDerecha extends Button {

    public BotonDerecha(AlgoBlocks algoBlocks){
        this.setText("Derecha");
        this.setOnAction(new MoverDerecha(algoBlocks));

    }

}
