package edu.fiuba.algo3.modelo;

public class BloqueArriba implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        int[] movimiento = {0, 1};
        personaje.actualizarPosicion(movimiento);
    }
}
