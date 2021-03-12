package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SectorDibujoTest {

    @Test
    public void test01SeCreaSectorDibujo(){
        assertTrue(SectorDibujo.obtenerSectorDibujo() instanceof SectorDibujo);
    }

    @Test
    public void test02SectorDibujoSeCreaVacio(){
        SectorDibujo.obtenerSectorDibujo().reiniciar();
        SectorDibujo sectorDibujo = SectorDibujo.obtenerSectorDibujo();
        assertEquals(0, sectorDibujo.obtenerDibujo().size());
    }

}