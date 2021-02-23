package edu.fiuba.algo3.Controlador;


import edu.fiuba.algo3.Vista.Dibujador;
import edu.fiuba.algo3.Vista.Tablero;
import edu.fiuba.algo3.modelo.Algoritmo;

import edu.fiuba.algo3.modelo.Posicion;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;



public class Ejecutar implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;
    private Tablero tablero;
    private Dibujador dibujadorConTrazo;

    public Ejecutar(Algoritmo algoritmo, Tablero tablero, Dibujador dibujadorConTrazo) {
        this.algoritmo = algoritmo;
        this.tablero = tablero;
        this.dibujadorConTrazo  = dibujadorConTrazo;

    }

    @Override
    public void handle(ActionEvent Event) {
        algoritmo.ejecutar();
        tablero.inicializar(dibujadorConTrazo.canvas);
        tablero.notifyObservers(dibujadorConTrazo);

    }
}
