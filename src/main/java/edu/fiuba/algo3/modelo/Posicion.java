package edu.fiuba.algo3.modelo;

public class Posicion {
    int x;
    int y;

    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int obtenerX() {
        return this.x;
    }

    public int obtenerY() {
        return this.y;
    }

    public boolean esIgualA(Posicion posicion){
        return this.x == posicion.obtenerX() && this.y == posicion.obtenerY();
    }

    public void sumarse(Posicion posicion) {
        this.x += posicion.obtenerX();
        this.y += posicion.obtenerY();
    }
}
