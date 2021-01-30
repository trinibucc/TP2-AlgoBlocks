package edu.fiuba.algo3.modelo;

public class BloqueIzquierda implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        int[] moviento = {-1, 0};
        personaje.actualizarPosicion(moviento);
    }
}
