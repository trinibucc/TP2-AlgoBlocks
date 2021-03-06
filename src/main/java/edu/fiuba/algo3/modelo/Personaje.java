package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.bloques.Lapiz;
import edu.fiuba.algo3.modelo.bloques.LapizAbajo;
import edu.fiuba.algo3.modelo.bloques.LapizArriba;
import edu.fiuba.algo3.modelo.dibujo.Posicion;

public class Personaje {

    private Posicion posicionInicial;
    private Posicion posicionFinal;
    private Lapiz lapiz;

    public Personaje(){
        this.posicionInicial = new Posicion(0, 0);
        this.posicionFinal = new Posicion(0, 0);
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

    public void actualizarPosicionFinal(Posicion posicion) {
        this.posicionInicial.copiarXY(this.posicionFinal);
        this.posicionFinal.sumarse(posicion);

    }

    public Posicion obtenerPosicion() {
        return this.posicionFinal;
    }

    public void dibujar(){
        lapiz.trazar(this.posicionInicial, this.posicionFinal);
    }

    public void reiniciar(){

        this.posicionFinal = new Posicion(0, 0);
        this.posicionInicial = new Posicion(0,0);
        this.lapiz = new LapizArriba();
    }

}
