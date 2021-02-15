package edu.fiuba.algo3.modelo;


public class BloqueAbajo implements Bloque {

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicionFinal(new Posicion(0, -1));
        personaje.dibujar();
    }

}
