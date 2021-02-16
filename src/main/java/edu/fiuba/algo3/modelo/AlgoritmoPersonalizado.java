package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoPersonalizado implements Bloque{

    List<Bloque> algoritmo = new ArrayList<>();
    String nombre;

    public AlgoritmoPersonalizado(List<Bloque> algoritmo, String nombre){
        for(Bloque bloque : algoritmo){
            this.algoritmo.add(bloque);
        }
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return nombre;
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


}
