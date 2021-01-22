package edu.fiuba.algo3.modelo;

public class BloqueAbajo extends Bloque {

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicion(0, -1);
    }
}
