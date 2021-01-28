package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void testMoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int horizontal = (algoBlocks.obtenerPersonaje()).obtenerHorizontal();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), horizontal -1);
    }

    @Test
    public void testMoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int vertical = (algoBlocks.obtenerPersonaje()).obtenerVertical();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), vertical + 1);
    }

    @Test
    public void testMoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int vertical = (algoBlocks.obtenerPersonaje()).obtenerVertical();
        int horizontal = (algoBlocks.obtenerPersonaje()).obtenerHorizontal();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), vertical + 1);
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), horizontal + 1);
    }

    @Test
    public void testMoverEnDistintasDireccionesYsubirLaíz(){
        AlgoBlocks algoBlocks = new AlgoBlocks();
        int vertical = (algoBlocks.obtenerPersonaje()).obtenerVertical();
        int horizontal = (algoBlocks.obtenerPersonaje()).obtenerHorizontal();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), vertical);
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), horizontal);
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
