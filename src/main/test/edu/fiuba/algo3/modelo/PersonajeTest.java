package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PersonajeTest {

    @Test // Prueba propuesta por la catedra.
    public void testSeCreaPersonajeConElLapizArriba() {
        Personaje personaje = new Personaje();
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testBajarLapizDelPersonaje(){
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        assertTrue(personaje.obtenerLapiz() instanceof  LapizAbajo);
    }

    @Test
    public void testBajarLapizDelPersonajeYVolverASubirlo(){
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testPersonajeSeCreaEnLaPosicionDelOrigenCorrecta(){
        Personaje personaje = new Personaje();
        int[] origen = {0, 0};
        assertArrayEquals(origen, personaje.obtenerPosicion());
    }

    @Test
    public void testActualizarPosicionDelPersonajeCorrectamente(){
        Personaje personaje = new Personaje();
        int[] movimiento = {1, 0};
        personaje.actualizarPosicion(movimiento);
        assertArrayEquals(movimiento, personaje.obtenerPosicion());
    }


}