package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controlador.BotonReiniciarEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.control.Button;

public class BotonReiniciar extends Button {

    public BotonReiniciar(AlgoBlocks algoBlocks, Algoritmo algoritmo){
        this.setText("BotonReiniciarEventHandler");
        this.setOnAction(new BotonReiniciarEventHandler(algoBlocks, algoritmo));
    }
}
