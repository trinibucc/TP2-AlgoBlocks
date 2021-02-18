package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Ejecutar implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;

    public Ejecutar(Algoritmo algoritmo){
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent Event){
        algoritmo.ejecutar();
    }
}
