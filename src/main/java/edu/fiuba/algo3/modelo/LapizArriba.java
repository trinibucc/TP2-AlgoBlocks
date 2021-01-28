package edu.fiuba.algo3.modelo;

public class LapizArriba implements Lapiz, Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }

    @Override
    public void dibujar(int[] posicion) {

    }
}
