package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SectorDibujoTest {

    @Test
    public void testSeCreaSectorDibujo(){
        assertTrue(SectorDibujo.obtenerSectorDibujo() instanceof SectorDibujo);
    }

   /* @Test
    public void testDibujaConLapizAbajoYNoDibujaConLapizArriba(){
        AlgoBlocks algoBlocks = new AlgoBlocks( new RecorridoSinRepeticion());
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();

        int[] dibujado = {0,0};
        //assertEquals(dibujado[0], SectorDibujo.obtenerSectorDibujo().)

    }*/

}
