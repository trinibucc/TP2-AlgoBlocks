package edu.fiuba.algo3.Vista;

import javafx.scene.canvas.Canvas;


import java.util.Observable;
import java.util.Observer;

public abstract class Dibujador extends Canvas implements Observer {

    private Tablero tablero;
    public Canvas canvas;


    public Dibujador(Tablero tablero){
        this.tablero = tablero;
        tablero.addObserver(this);

    }

    @Override
    public void update(Observable observable, Object o) {
        Dibujador dibujador = (Dibujador) o;
        if(dibujador.equals(o))
            actualizar();

    }

    public Tablero obtenerTablero(){
        return tablero;
    }


    protected abstract void actualizar();
}
