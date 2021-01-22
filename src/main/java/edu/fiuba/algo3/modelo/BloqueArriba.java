package edu.fiuba.algo3.modelo;

public class BloqueArriba extends Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.actualizarPosicion(0, 1);
    }
}
