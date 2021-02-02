package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PersonajeTest {

    @Test
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
        int[] origen = {0, 0};
        Personaje personaje = new Personaje();
        assertArrayEquals(origen, personaje.obtenerPosicion());
    }

    @Test
    public void testActualizarPosicionDelPersonajeCorrectamente(){
        int[] posicion = {1, 0};
        Personaje personaje = new Personaje();
        personaje.actualizarPosicion(posicion);
        assertArrayEquals(posicion, personaje.obtenerPosicion());
    }

}