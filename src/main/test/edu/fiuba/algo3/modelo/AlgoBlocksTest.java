package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgoBlocksTest {

    @Test
    public void test01LevantarLapizConBloqueLevantaLapizPersonajeLevantaElLapiz(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test02BajarLapizConBloqueBajaLazpizPersonajeBajaElLapiz(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarLapizAbajo();
        algoBlocks.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void test03MoverDerechaConBloqueMoverDerechaPersonajeSeMueveALaDerecha(){
        int[] posicion = {1, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test04MoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        int[] posicion = {0, -1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test05MoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        int[] posicion = {-1, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test06MoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        int[] posicion = {0, 1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test07MoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        int[] posicion = {-1, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test08MoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        int[] posicion = {0, 1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test09MoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        int[] posicion = {1, 1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
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
    public void test10MoverEnDistintasDireccionesYsubirLapiz(){
        int[] posicion = {0, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
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
    public void test11MoverEnDistintasDireccionesNoAfectaAlLapiz() {
        int[] posicion = {0, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        Lapiz lapiz = algoBlocks.obtenerPersonaje().obtenerLapiz();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test12UsarBloqueRepetirDosVecesYPersonajeSeMueveCorrectamente(){
        int[] posicion = {3, -1};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirDosVeces = algoBlocks.agregarBloqueRepetirDosVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirDosVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test13UsarBloqueRepetirTresVecesYPersonajeSeMueveCorrectamente(){
        int[] posicion = {4, -2};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirTresVeces = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirTresVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

    @Test
    public void test14AgregarBloquesDeMovimientoSimlesDespuesDeAgregarBloquesDeRepetirPersonajeSeMueveCorrectamente(){
        int[] posicion = {4, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirTresVeces = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirTresVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, algoBlocks.obtenerPersonaje().obtenerPosicion());
    }

    @Test
    public void test15UsarBloqueInversoYPersonajeRealizaMovimientosAlReves(){
        int[] posicion = {2, 0};
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueInverso bloqueInverso = algoBlocks.agregarBloqueInverso();
        AlgoBlocks algoritmoIterativo = bloqueInverso.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }
}