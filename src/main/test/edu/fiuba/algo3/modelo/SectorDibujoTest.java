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
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks( new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();

        int[] dibujado = {0,0};
        assertArrayEquals(dibujado, (SectorDibujo.obtenerSectorDibujo()).obtenerDibujo());

    }


}