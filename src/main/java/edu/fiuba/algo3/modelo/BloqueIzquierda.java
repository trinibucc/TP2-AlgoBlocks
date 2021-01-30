package edu.fiuba.algo3.modelo;

public class BloqueIzquierda implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        int[] movimiento = {-1, 0};
        personaje.actualizarPosicion(movimiento);
    }
}
