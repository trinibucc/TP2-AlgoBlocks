package edu.fiuba.algo3.modelo;

public class LapizArriba implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }
}
