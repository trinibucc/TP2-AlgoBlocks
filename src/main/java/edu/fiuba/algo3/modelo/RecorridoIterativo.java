package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RecorridoIterativo implements Recorrido {

    private List<Bloque> algoritmo;
    private int repeticion;
    private Personaje personaje;

    public RecorridoIterativo(int repeticion, Personaje personaje) {
        this.repeticion = repeticion;
        this.algoritmo = new ArrayList<>();
        this.personaje = personaje;
    }
    @Override
    public void ejecutar(){
        int repetido = 0;
        while(repetido < repeticion){
            for(Bloque bloque : algoritmo) {
                bloque.ejecutar(personaje);
            }
            repetido++;
        }
    }
    @Override
    public AlgoBlocks agregarBloque(){
        return (new AlgoBlocks(this, personaje));
    }
    @Override
    public List<Bloque> obtenerRecorrido(){
        return algoritmo;
    }
}
