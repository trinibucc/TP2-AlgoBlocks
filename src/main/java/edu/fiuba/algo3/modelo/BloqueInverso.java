package edu.fiuba.algo3.modelo;


import java.util.Collections;

public class BloqueInverso extends BloqueIterativo {

    public BloqueInverso() {

    }

    public void ejecutar(Personaje personaje){
        //algoritmo.invertir()
        Collections.reverse(algoritmo);
        this.recorrer(personaje);
    }


}
