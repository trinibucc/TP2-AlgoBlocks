package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BloqueTest {

    @Test
    public void testBloqueDerechaSeEjecutaYmueveAPersonaje(){
        int[] movimiento = {1, 0};
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Personaje personaje = new Personaje();
        bloqueDerecha.ejecutar(personaje);
        assertArrayEquals(movimiento, personaje.obtenerPosicion());
    }

    @Test
    public void testBloqueIzquierdaSeEjecutaYmueveAPersonaje(){
        int[] movimiento = {-1, 0};
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        Personaje personaje = new Personaje();
        bloqueIzquierda.ejecutar(personaje);
        assertArrayEquals(movimiento, personaje.obtenerPosicion());
    }

    @Test
    public void testBloqueArribaSeEjecutaYmueveAPersonaje(){
        int[] movimiento = {0, 1};
        BloqueArriba bloqueArriba = new BloqueArriba();
        Personaje personaje = new Personaje();
        bloqueArriba.ejecutar(personaje);
        assertArrayEquals(movimiento, personaje.obtenerPosicion());
    }

    @Test
    public void testBloqueAbajoSeEjecutaYmueveAPersonaje(){
        int[] movimiento = {0, -1};
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Personaje personaje = new Personaje();
        bloqueAbajo.ejecutar(personaje);
        assertArrayEquals(movimiento, personaje.obtenerPosicion());
    }

    @Test
    public void testLapizAbajoCambiaElLapizDelPersonaje(){
        LapizAbajo lapizAbajo = new LapizAbajo();
        Personaje personaje = new Personaje();
        lapizAbajo.ejecutar(personaje);
        assertTrue(personaje.obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void testLapizArribaCambiaElLapizDelPersonaje(){
        LapizArriba lapizArriba = new LapizArriba();
        Personaje personaje = new Personaje();
        lapizArriba.ejecutar(personaje);
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

}
