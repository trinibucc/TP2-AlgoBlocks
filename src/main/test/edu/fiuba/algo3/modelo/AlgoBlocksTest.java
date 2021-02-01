package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoBlocksTest {

    @Test
    public void testLevantarLapizConBloqueLevantaLapizPersonajeLevantaElLapiz(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testBajarLapizConBloqueBajaLazpizPersonajeBajaElLapiz(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarLapizAbajo();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void testMoverDerechaConBloqueMoverDerechaPersonajeSeMueveALaDerecha(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        int xantes = algoBlocks.obtenerPersonaje().obtenerHorizontal();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), xantes + 1);
    }

    @Test
    public void testMoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueAbajo();
        int yAntes = algoBlocks.obtenerPersonaje().obtenerVertical();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), yAntes - 1);
    }

    @Test
    public void testMoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueIzquierda();
        int xAntes = algoBlocks.obtenerPersonaje().obtenerHorizontal();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), xAntes - 1);
    }

    @Test
    public void testMoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueArriba();
        int yAntes = algoBlocks.obtenerPersonaje().obtenerVertical();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), yAntes + 1);
    }

    @Test
    public void testMoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        int horizontal = (algoBlocks.obtenerPersonaje()).obtenerHorizontal();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerHorizontal(), horizontal -1);
    }

    @Test
    public void testMoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        int vertical = (algoBlocks.obtenerPersonaje()).obtenerVertical();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerVertical(), vertical + 1);
    }

    @Test
    public void testMoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
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
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
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
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        Lapiz lapiz = algoBlocks.obtenerPersonaje().obtenerLapiz();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertEquals(algoBlocks.obtenerPersonaje().obtenerLapiz(), lapiz);
    }

    @Test
    public void testUsarBloqueRepetirDosVecesYPersonajeSeMueveCorrectamente(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        Recorrido recorridoIterativo = algoBlocks.agregarBloqueRepetirDosVeces();
        AlgoBlocks algoritmoIterativo = recorridoIterativo.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();

        assertEquals(personaje.obtenerVertical(), -1);
        assertEquals(personaje.obtenerHorizontal(), 3);

    }

    @Test
    public void testUsarBloqueRepetirTresVecesYPersonajeSeMueveCorrectamente(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        Recorrido recorridoIterativo = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = recorridoIterativo.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();

        assertEquals(personaje.obtenerVertical(), -2);
        assertEquals(personaje.obtenerHorizontal(), 4);
    }

    public void testAgregarBloquesDeMovimientoSimlesDespuesDeAgregarBloquesDeRepetirPersonajeSeMueveCorrectamente(){
        int[] posicion = {4, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        Recorrido recorridoIterativo = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = recorridoIterativo.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }
}
