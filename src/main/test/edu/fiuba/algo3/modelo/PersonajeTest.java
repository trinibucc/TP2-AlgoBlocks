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
    public void testPersonajeSeCreaConPosicionVertical0(){
        Personaje personaje = new Personaje();
        assertEquals(personaje.obtenerVertical(), 0);
    }

    @Test
    public void testPersonajeSeCreaConPosicionHorizontal0(){
        Personaje personaje = new Personaje();
        assertEquals(personaje.obtenerHorizontal(), 0);
    }

    @Test
    public void testActualizarPosicionDelPersonajeCorrectamente(){
        Personaje personaje = new Personaje();
        int posicionEsperada[] = {1, 2};
        int[] posicionFinal = new int[2];
        personaje.actualizarPosicion(1, 2);
        posicionFinal[0] = personaje.obtenerHorizontal();
        posicionFinal[1] = personaje.obtenerVertical();
        assertArrayEquals(posicionFinal, posicionEsperada);
    }


}
