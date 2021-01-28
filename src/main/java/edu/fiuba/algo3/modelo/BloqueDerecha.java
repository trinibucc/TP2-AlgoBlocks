package edu.fiuba.algo3.modelo;

public class BloqueDerecha implements Bloque {

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicion(1, 0);
    }
}
