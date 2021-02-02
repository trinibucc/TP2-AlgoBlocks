package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RecorridoInverso implements Recorrido{

    private List<Bloque> algoritmo;
    private Personaje personaje;

    public RecorridoInverso(Personaje personaje) {
        this.algoritmo = new ArrayList<>();
        this.personaje = personaje;
    }

    @Override
    public void ejecutar(){
        Collections.reverse(algoritmo);
        for(Bloque bloque : algoritmo){
            bloque.ejecutar(personaje);
        }
    }

    public AlgoBlocks agregarBloque(){
        return (new AlgoBlocks(this, personaje));
    }

    @Override
    public List<Bloque> obtenerRecorrido(){
        return algoritmo;
    }

}
