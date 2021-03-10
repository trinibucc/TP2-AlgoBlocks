package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Algoritmo {

    private List<Bloque> algoritmo;
    private Personaje personaje;

    public Algoritmo(Personaje personaje){
        this.algoritmo = new ArrayList<>();
        this.personaje = personaje;
    }

    public void ejecutar(){
        if(this.algoritmo.size() < 1){
            throw new CantidadInsuficienteDeBloquesError();
        }
        for(Bloque bloque : this.algoritmo){
            bloque.ejecutar(this.personaje);
        }
    }

    public void agregarLista(AlgoBlocks algoBlocks){
        algoBlocks.agregarLista(this.algoritmo);
    }

    public void reiniciar(){
        this.algoritmo.clear();
    }

}