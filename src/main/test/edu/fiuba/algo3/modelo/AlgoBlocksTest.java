package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgoBlocksTest {

    @Test
    public void testLevantarLapizConBloqueLevantaLapizPersonaLevantaElLapiz(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testBajarLapizConBloqueBajaLazpizPersonaBajaElLapiz(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void testMoverDerechaConBloqueMoverDerechaPersonajeSeMueveALaDerecha(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarBloqueDerecha();
        int xantes = algoBlocks.obtenerPersonaje().obtenerHorizontal();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), xantes + 1);
    }

    @Test
    public void testMoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarBloqueAbajo();
        int yAntes = algoBlocks.obtenerPersonaje().obtenerVertical();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), yAntes - 1);
    }

    @Test
    public void testMoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarBloqueIzquierda();
        int xAntes = algoBlocks.obtenerPersonaje().obtenerHorizontal();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), xAntes - 1);
    }

    @Test
    public void testMoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarBloqueArriba();
        int yAntes = algoBlocks.obtenerPersonaje().obtenerVertical();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), yAntes + 1);
    }
}
