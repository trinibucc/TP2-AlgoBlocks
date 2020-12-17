package edu.fiuba.algo3.modelo;

import javafx.geometry.Point2D;

public class Posicion {

    private Point2D coordenadas;
    private Posicion siguiente;

    public Posicion(int vertical, int horizontal){
        coordenadas = new Point2D(horizontal,vertical);
        siguiente = null;
    }

    public Point2D getCoordenadas(){
        return coordenadas;
    }

    public void asignarSiguiente(){
        siguiente = new Posicion(0, 0);
    }

}

