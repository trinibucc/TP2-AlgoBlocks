package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonReiniciarEventHandler;
import edu.fiuba.algo3.vista.VistaTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class BotonReiniciar extends Button {

    public BotonReiniciar(AlgoBlocks algoBlocks, Algoritmo algoritmo, VistaTablero vistaTablero){

        this.setText("Reiniciar");
        this.setOnAction(new BotonReiniciarEventHandler(algoBlocks, algoritmo, vistaTablero));
        this.setLineSpacing(10);
        this.setFont(new Font("candara", 16));
    }
}
