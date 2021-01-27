package edu.fiuba.algo3.modelo;

public class BloqueIzquierda implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.actualizarPosicion(-1 ,0);
    }
}
