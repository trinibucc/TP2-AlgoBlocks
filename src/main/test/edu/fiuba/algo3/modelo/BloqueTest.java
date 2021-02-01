package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloqueTest {

    @Test
    public void testBloqueDerechaSeEjecutaYmueveAPersonaje(){
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Personaje personaje = new Personaje();
        int posicionHorizontal = personaje.obtenerHorizontal();
        bloqueDerecha.ejecutar(personaje);

        assertEquals(personaje.obtenerHorizontal(), posicionHorizontal + 1);
    }

    @Test
    public void testBloqueIzquierdaSeEjecutaYmueveAPersonaje(){
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        Personaje personaje = new Personaje();
        int posicionHorizontal = personaje.obtenerHorizontal();
        bloqueIzquierda.ejecutar(personaje);

        assertEquals(personaje.obtenerHorizontal(), posicionHorizontal - 1);
    }

    @Test
    public void testBloqueArribaSeEjecutaYmueveAPersonaje(){
        BloqueArriba bloqueArriba = new BloqueArriba();
        Personaje personaje = new Personaje();
        int posicionVertical = personaje.obtenerVertical();
        bloqueArriba.ejecutar(personaje);

        assertEquals(personaje.obtenerVertical(), posicionVertical + 1);
    }

    @Test
    public void testBloqueAbajoSeEjecutaYmueveAPersonaje(){
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Personaje personaje = new Personaje();
        int posicionVertical = personaje.obtenerVertical();
        bloqueAbajo.ejecutar(personaje);

        assertEquals(personaje.obtenerVertical(), posicionVertical - 1);
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