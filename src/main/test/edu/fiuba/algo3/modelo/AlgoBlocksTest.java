package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoBlocksTest {

    @Test
    public void testLevantarLapizConBloqueLevantaLapizPersonajeLevantaElLapiz(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testBajarLapizConBloqueBajaLazpizPersonajeBajaElLapiz(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void testMoverDerechaConBloqueMoverDerechaPersonajeSeMueveALaDerecha(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {1, 0};
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {0, -1};
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {-1, 0};
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {0, 1};
        algoBlocks.agregarBloqueArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {-1, 0};
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {0, 1};
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {1, 1};
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void testMoverEnDistintasDireccionesYSubirLapiz(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int[] movimiento = {0, 0};
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(movimiento, algoBlocks.obtenerPersonaje().obtenerPosicion());
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testMoverEnDistintasDireccionesNoAfectaAlLapiz() {
        AlgoBlocks algoBlocks = new AlgoBlocks();
        Bloque lapiz = algoBlocks.obtenerPersonaje().obtenerLapiz();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerLapiz(), lapiz);
    }
}
