package edu.fiuba.algo3.modelo;

import javafx.geometry.Pos;
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
        Posicion posicion = new Posicion(1, 0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test04MoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        Posicion posicion = new Posicion(0, -1);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test05MoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        Posicion posicion = new Posicion(-1 , 0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test06MoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        Posicion posicion = new Posicion(0, 1);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test07MoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(-1, 0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test08MoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(0, 1);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test09MoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(1, 1);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test10MoverEnDistintasDireccionesYsubirLapiz(){
        Posicion posicion = new Posicion(0, 0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test11MoverEnDistintasDireccionesNoAfectaAlLapiz() {
        Posicion posicion = new Posicion(0,  0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test12UsarBloqueRepetirDosVecesYPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(3, -1);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirDosVeces = algoBlocks.agregarBloqueRepetirDosVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirDosVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test13UsarBloqueRepetirTresVecesYPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(4, -2);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirTresVeces = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirTresVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test14AgregarBloquesDeMovimientoSimlesDespuesDeAgregarBloquesDeRepetirPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(4, 0);
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
        assertTrue(algoBlocks.obtenerPersonaje().obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test15UsarBloqueInversoYPersonajeRealizaMovimientosAlReves(){
        Posicion posicion = new Posicion(2, 0);
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueInverso bloqueInverso = algoBlocks.agregarBloqueInverso();
        AlgoBlocks algoritmoIterativo = bloqueInverso.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }
}