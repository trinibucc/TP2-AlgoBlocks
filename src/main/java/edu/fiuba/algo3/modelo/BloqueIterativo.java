package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class BloqueIterativo implements Bloque{

    protected List<Bloque> algoritmo = new ArrayList<>();
    protected Personaje personaje;

    public void recorrer(Personaje personaje) {
        for (Bloque bloque : this.algoritmo) {
            bloque.ejecutar(personaje);
        }
    }

    public void agregarBloque(AlgoBlocks algoBlocks){
        algoBlocks.agregarLista(algoritmo);
    }

    public List<Bloque> obtenerLista(){
        return algoritmo;
    }

}
