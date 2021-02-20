package edu.fiuba.algo3.modelo;


public class LapizArriba implements Lapiz, Bloque{

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }

    @Override
    public void trazar(Posicion posicionInicial, Posicion posicionFinal) {
    }

    public Bloque opuesto(){
        return new LapizAbajo();
    }

}
