package edu.fiuba.algo3.modelo;

import org.junit.Test;


public class NombreInvalidoErrorTest {

    @Test (expected = NombreInvalidoError.class)
    public void test01GuardarUnAlgoritmoConElBloquePersonalizadoiYNombreYaExistenteLanzaNombreInvalidoError(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.guardarAlgoritmo("ArribaAbajo");
        algoBlocks.guardarAlgoritmo("ArribaAbajo");
    }

}
