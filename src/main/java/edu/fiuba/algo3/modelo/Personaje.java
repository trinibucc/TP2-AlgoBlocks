package edu.fiuba.algo3.modelo;
import javafx.geometry.Point2D;

public class Personaje {
    private Posicion posicion;
    private Direccion direccion;

    public Personaje(){
        this.posicion = new Posicion(0, 0);
        this.direccion = new Direccion();
    }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public boolean tieneLapizArriba() {
        return this.direccion.ConLapizArriba();
    }

    public void bajarLapiz() {
        this.direccion.bajarLapiz();
    }

    public void subirLapiz() {
        this.direccion.subirLapiz();
    }

    public void mover(String direccion) {
        this.posicion = this.direccion.mover(this.posicion, direccion);
    }
}
