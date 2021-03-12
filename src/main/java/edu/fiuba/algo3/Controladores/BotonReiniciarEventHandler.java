package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Vista.VistaTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonReiniciarEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private Algoritmo algoritmo;
    private VistaTablero vistaTablero;

    public BotonReiniciarEventHandler(AlgoBlocks algoBlocks, Algoritmo algoritmo, VistaTablero vistaTablero){

        this.algoBlocks = algoBlocks;
        this.algoritmo = algoritmo;
        this.vistaTablero = vistaTablero;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        algoritmo.agregarLista(algoBlocks);
        algoritmo.reiniciar();
        algoBlocks.reiniciar();
        vistaTablero.actualizar();
    }
}
