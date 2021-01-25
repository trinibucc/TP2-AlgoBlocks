package edu.fiuba.algo3.modelo;

public class LapizArriba extends Lapiz {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }
}
