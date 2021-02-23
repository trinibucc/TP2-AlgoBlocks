package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class NombreInvalidoErrorTest {

    @Test
    public void test01GuardarUnAlgoritmoConElBloquePersonalizadoiYNombreYaExistenteLanzaNombreInvalidoError(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.guardarAlgoritmo("ArribaAbajo");
        assertThrows(NombreInvalidoError.class,
                () -> {
                    algoBlocks.guardarAlgoritmo("ArribaAbajo");
                });
    }

}
