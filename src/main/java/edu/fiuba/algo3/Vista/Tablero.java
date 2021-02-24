package edu.fiuba.algo3.Vista;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.Observable;

public class Tablero extends Observable {

    private Canvas tablero;

    public Tablero(Canvas tablero){
        this.tablero = tablero;
    }

    public Canvas getCanvas(){
        return tablero;
    }

    public void inicializar(Canvas canvas){
        this.tablero = canvas;
        setChanged();
    }

    public void trazar(GraphicsContext g) {


    }
}
