package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class SectorDibujoTest {

    @Test
    public void testSeCreaSectorDibujo(){
        assertTrue(SectorDibujo.obtenerSectorDibujo() instanceof SectorDibujo);
    }

    @Test
    public void testSectorDibujoSeCreaVacio(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        SectorDibujo sectorDibujo = SectorDibujo.obtenerSectorDibujo();
        assertEquals(0, sectorDibujo.obtenerDibujo().size());
    }

}