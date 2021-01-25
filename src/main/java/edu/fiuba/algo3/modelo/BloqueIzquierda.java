package edu.fiuba.algo3.modelo;

public class BloqueIzquierda extends Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.actualizarPosicion(-1 ,0);
    }
}
