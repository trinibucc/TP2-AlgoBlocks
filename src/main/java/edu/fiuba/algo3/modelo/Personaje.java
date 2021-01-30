package edu.fiuba.algo3.modelo;

public class Personaje {

    private Lapiz lapiz;
    private int[] posicion;

    public Personaje(){
        this.lapiz = new LapizArriba();
        this.posicion = new int[2];
        this.posicion[0] = 0;
        this.posicion[1] = 0;
    }

    private void sumarPosiciones(int[] posicion){
        this.posicion[0] += posicion[0];
        this.posicion[1] += posicion[1];
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

    public void actualizarPosicion(int[] movimiento) {
        this.sumarPosiciones(movimiento);
    }

    public int[] obtenerPosicion() {
        return posicion;
    }

    public int obtenerHorizontal(){
        return posicion[0];
    }

    public int obtenerVertical(){
        return posicion[1];
    }

    public void dibujar(){
        lapiz.dibujar(posicion);
    }
}
