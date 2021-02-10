package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Recorrido {

    private List<Bloque> recorrido;
    private Personaje personaje;

    public Recorrido(Personaje personaje){
        this.recorrido = new ArrayList<Bloque>();
        this.personaje = personaje;
    }

    public void ejecutar(){
        for(Bloque bloque : this.recorrido){
            bloque.ejecutar(this.personaje);
        }
    }

    public List<Bloque> obtenerRecorrido(){
        return this.recorrido;
    }

}