package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

public abstract class BloqueIterativo implements Bloque {

    protected List<Bloque> algoritmo = new ArrayList<>();
    protected Personaje personaje;

    public void recorrer(Personaje personaje) {
        for (Bloque bloque: this.algoritmo) {
            bloque.ejecutar(personaje);
        }
    }

    public void agregarBloque(AlgoBlocks algoBlocks){
        algoBlocks.agregarLista(this.algoritmo);
    }

    public List<Bloque> obtenerLista(){
        return algoritmo;
    }

    public Bloque opuesto(){
        return this;
    }
}
