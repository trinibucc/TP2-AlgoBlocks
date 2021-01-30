package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RecorridoSinRepeticion implements Recorrido{

    private List<Bloque> recorrido;
    private Personaje personaje;


    public RecorridoSinRepeticion(Personaje personaje){
        this.recorrido = new ArrayList<>();
        this.personaje = personaje;

    }

    @Override
    public void ejecutar(){
        for(Bloque bloque : recorrido){
            bloque.ejecutar(personaje);
        }
    }

    @Override
    public AlgoBlocks agregarBloque() {

        return null;
    }
    @Override
    public List<Bloque> obtenerRecorrido(){
        return recorrido;
    }
}
