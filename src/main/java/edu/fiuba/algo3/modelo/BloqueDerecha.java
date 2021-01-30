package edu.fiuba.algo3.modelo;

public class BloqueDerecha implements Bloque {

    public void ejecutar(Personaje personaje){
        int[] movimiento = {1, 0};
        personaje.actualizarPosicion(movimiento);
    }
}
