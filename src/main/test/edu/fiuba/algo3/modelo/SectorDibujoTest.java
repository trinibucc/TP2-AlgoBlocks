package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SectorDibujoTest {

    @Test
    public void testSeCreaSectorDibujo(){
        assertTrue(SectorDibujo.obtenerSectorDibujo() instanceof SectorDibujo);
    }

   @Test
    public void testDibujaConLapizAbajoYNoDibujaConLapizArriba(){
        Posicion posicion = new Posicion(0, 0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks( new Algoritmo(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertTrue((SectorDibujo.obtenerSectorDibujo()).obtenerDibujo().esIgualA(posicion));
    }

}