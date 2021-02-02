package edu.fiuba.algo3.modelo;


public class BloqueAbajo implements Bloque {

    public void ejecutar(Personaje personaje){
        int[] movimiento = {0, -1};
        personaje.actualizarPosicion(movimiento);
        personaje.dibujar();
    }

}
