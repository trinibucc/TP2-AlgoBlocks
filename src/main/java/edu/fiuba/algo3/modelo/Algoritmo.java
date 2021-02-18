package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Algoritmo {

    private List<Bloque> algoritmo;
    private Personaje personaje;

    public Algoritmo(Personaje personaje){
        this.algoritmo = new ArrayList<Bloque>();
        this.personaje = personaje;
    }

    public void ejecutar(){
        for(Bloque bloque : this.algoritmo){
            bloque.ejecutar(this.personaje);
        }
    }

    public void agregarLista(AlgoBlocks algoBlocks){
        algoBlocks.agregarLista(algoritmo);
    }

    public List<Bloque> obtenerRecorrido(){
        return this.algoritmo;
    }


}