package edu.fiuba.algo3.modelo;


public class Personaje {

    private Posicion posicion;
    private Lapiz lapiz;

    public Personaje(){
        this.posicion = new Posicion(0, 0);
        this.lapiz = new LapizArriba();
    }

    public Lapiz obtenerLapiz() {
        return this.lapiz;
    }

    public void subirLapiz() {
        this.lapiz = new LapizArriba();
    }

    public void bajarLapiz() {
        this.lapiz = new LapizAbajo();
    }

    public void actualizarPosicion(Posicion posicion) {
        this.posicion.sumarse(posicion);
    }

    public Posicion obtenerPosicion() {
        return this.posicion;
    }

    public void dibujar(){
        lapiz.dibujar(this.posicion);
    }

}
