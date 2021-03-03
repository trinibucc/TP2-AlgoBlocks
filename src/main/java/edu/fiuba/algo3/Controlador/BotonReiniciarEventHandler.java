package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonReiniciarEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private Algoritmo algoritmo;

    public BotonReiniciarEventHandler(AlgoBlocks algoBlocks, Algoritmo algoritmo){
        this.algoBlocks = algoBlocks;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoritmo.agregarLista(algoBlocks);
        algoBlocks.reiniciar();
    }
}
