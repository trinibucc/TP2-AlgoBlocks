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
        int[] posicion = {1, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        int[] posicion = {0, -1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        int[] posicion = {-1, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        int[] posicion = {0, 1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        int[] posicion = {-1, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        int[] posicion = {0, 1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        int[] posicion = {1, 1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testMoverEnDistintasDireccionesYsubirLapiz(){
        int[] posicion = {0, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testMoverEnDistintasDireccionesNoAfectaAlLapiz() {
        int[] posicion = {0, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        Lapiz lapiz = algoBlocks.obtenerPersonaje().obtenerLapiz();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testUsarBloqueRepetirDosVecesYPersonajeSeMueveCorrectamente(){
        int[] posicion = {3, -1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        Recorrido recorridoIterativo = algoBlocks.agregarBloqueRepetirDosVeces();
        AlgoBlocks algoritmoIterativo = recorridoIterativo.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void testUsarBloqueRepetirTresVecesYPersonajeSeMueveCorrectamente(){
        int[] posicion = {4, -2};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        Recorrido recorridoIterativo = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = recorridoIterativo.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
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

    @Test
    public void testUsarBloqueInversoYPersonajeRealizaMovimientosAlReves(){
        int[] posicion = {2, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new RecorridoSinRepeticion(personaje), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        Recorrido inverso = algoBlocks.agregarBloqueInverso();
        AlgoBlocks algoritmoIterativo = inverso.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }
}