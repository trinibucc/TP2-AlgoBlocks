package edu.fiuba.algo3.modelo;


import java.util.Collections;

public class BloqueInverso extends BloqueIterativo {

    public BloqueInverso(Personaje personaje) {
        this.personaje = personaje;
    }

    public void ejecutar(Personaje personaje){
        Collections.reverse(algoritmo);
        this.recorrer(personaje);
    }


}
