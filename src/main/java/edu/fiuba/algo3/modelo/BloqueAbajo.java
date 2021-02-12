package edu.fiuba.algo3.modelo;


public class BloqueAbajo implements Bloque {

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicion(new Posicion(0, -1));
        personaje.dibujar();
    }

}
