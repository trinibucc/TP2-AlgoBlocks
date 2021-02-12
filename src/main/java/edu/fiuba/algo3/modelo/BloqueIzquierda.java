package edu.fiuba.algo3.modelo;


public class BloqueIzquierda implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.actualizarPosicion(new Posicion(-1, 0 ));
        personaje.dibujar();
    }

}
