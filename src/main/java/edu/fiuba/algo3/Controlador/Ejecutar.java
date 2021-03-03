package edu.fiuba.algo3.Controlador;


import edu.fiuba.algo3.Vista.Dibujador;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class Ejecutar implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;
    private Dibujador dibujadorConTrazo;

    public Ejecutar(Algoritmo algoritmo, Dibujador dibujadorConTrazo) {
        this.algoritmo = algoritmo;
        this.dibujadorConTrazo  = dibujadorConTrazo;

    }

    @Override
    public void handle(ActionEvent Event) {
        algoritmo.ejecutar();
        dibujadorConTrazo.actualizar();


    }
}
