package edu.fiuba.algo3.modelo;

import java.util.List;

public interface Recorrido {

    void ejecutar();
    AlgoBlocks agregarBloque();

    List<Bloque> obtenerRecorrido();
}
