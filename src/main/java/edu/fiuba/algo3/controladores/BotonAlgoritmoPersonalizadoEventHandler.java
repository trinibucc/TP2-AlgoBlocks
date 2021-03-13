package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAlgoritmoPersonalizadoEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private String nombre;


    public BotonAlgoritmoPersonalizadoEventHandler(AlgoBlocks algoBlocks, String nombre) {

        this.algoBlocks = algoBlocks;
        this.nombre = nombre;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        algoBlocks.agregarAlgoritmoPersonalizado(nombre);

    }
}
