package edu.fiuba.algo3.modelo;

public class Posicion {
    private int enumeracion;
    private Posicion siguiente;

    public void Posicion(int d){
        enumeracion = d;
        siguiente = null;
    }

    public void establecerSiguiente(){
        siguiente = new Posicion();
    }


}
