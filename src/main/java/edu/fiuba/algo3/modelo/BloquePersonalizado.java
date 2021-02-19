package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class BloquePersonalizado implements Bloque{

    List<Bloque> algoritmo = new ArrayList<>();


    public BloquePersonalizado(List<Bloque> algoritmo){
        for(Bloque bloque : algoritmo){
            this.algoritmo.add(bloque);
        }

    }

    public List<Bloque> obtenerAlgoritmo(){
        return this.algoritmo;
    }

    @Override
    public void ejecutar(Personaje personaje) {
        for(Bloque bloque : algoritmo){
            bloque.ejecutar(personaje);
        }
    }

    public Bloque opuesto(){
        return this;
    }


}
