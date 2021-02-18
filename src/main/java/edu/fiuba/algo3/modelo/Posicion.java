package edu.fiuba.algo3.modelo;

public class Posicion {
    double x;
    double y;

    public Posicion(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double obtenerX() {
        return this.x;
    }

    public double obtenerY() {
        return this.y;
    }

    public boolean esIgualA(Posicion posicion){
        return this.x == posicion.obtenerX() && this.y == posicion.obtenerY();
    }

    public void sumarse(Posicion posicion) {
        this.x += posicion.obtenerX();
        this.y += posicion.obtenerY();
    }

    public void copiarXY(Posicion posicion) {
        this.x = posicion.obtenerX();
        this.y = posicion.obtenerY();
    }
}
