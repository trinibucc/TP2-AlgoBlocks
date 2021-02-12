package edu.fiuba.algo3.modelo;


public class BloqueDerecha implements Bloque {

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicion(new Posicion(1, 0));
        personaje.dibujar();
    }

}
