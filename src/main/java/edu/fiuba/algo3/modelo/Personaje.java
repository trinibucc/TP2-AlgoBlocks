package edu.fiuba.algo3.modelo;
import javafx.geometry.Point2D;

public class Personaje {

    private Lapiz lapiz;
    private int horizontal;
    private int vertical;

    public Personaje(){
        this.lapiz = new LapizArriba();
        this.horizontal = 0;
        this.vertical = 0;
    }

    public void subirLapiz() {
        this.lapiz = new LapizArriba();
    }

    public Lapiz obtenerLapiz() {
        return this.lapiz;
    }

    public void bajarLapiz() {
        this.lapiz = new LapizAbajo();
    }

    public void actualizarPosicion(int horizontal, int vertical) {
        this.horizontal += horizontal;
        this.vertical += vertical;
    }

    public int obtenerHorizontal() {
        return this.horizontal;
    }

    public int obtenerVertical() {
        return this.vertical;
    }
}
