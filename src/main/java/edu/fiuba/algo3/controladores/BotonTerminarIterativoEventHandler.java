package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonTerminarIterativoEventHandler implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;
    private AlgoBlocks algoBlocks;

    public BotonTerminarIterativoEventHandler(AlgoBlocks algoBlocks, Algoritmo algoritmo){
        this.algoBlocks = algoBlocks;
        this.algoritmo = algoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoritmo.agregarLista(algoBlocks);
    }
}
