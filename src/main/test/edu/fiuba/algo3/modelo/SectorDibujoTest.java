package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SectorDibujoTest {

    @Test
    public void testSeCreaSectorDibujo(){
        assertTrue(SectorDibujo.obtenerSectorDibujo() instanceof SectorDibujo);
    }

   /*@Test
    public void testDibujaConLapizAbajoYNoDibujaConLapizArriba(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks( new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();

        int[] dibujado = {-1,0};
        assertEquals(dibujado, (SectorDibujo.obtenerSectorDibujo()).obtenerDibujo());


    }*/


}
