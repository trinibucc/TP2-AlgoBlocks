package edu.fiuba.algo3.Botones.EventHandler;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Reiniciar implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private Algoritmo algoritmo;

    public Reiniciar(AlgoBlocks algoBlocks, Algoritmo algoritmo){
        this.algoBlocks = algoBlocks;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoritmo.agregarLista(algoBlocks);
        algoBlocks.reiniciar();
    }
}
