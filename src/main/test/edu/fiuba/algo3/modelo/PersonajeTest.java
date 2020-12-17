package edu.fiuba.algo3.modelo;

import javafx.geometry.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {
    @Test
    public void testSeCreaPersonajeEnLaPosicionCorrecta(){
        Personaje personaje = new Personaje();
        Point2D origen = new Point2D(0, 0);
        assertEquals(personaje.getPosicion().distance(origen), 0);
    }

    @Test
    public void testSeCreaPersonajeLaPosicionNoEsLaCorrecta(){
        Personaje personaje = new Personaje();
        Point2D noOrigen = new Point2D(2, 1);
        assertNotEquals(personaje.getPosicion().distance(noOrigen), 0);
    }

    @Test
    public void testSeCreaPersonajeConElLapizHaciaArriba(){
        Personaje personaje = new Personaje();
        assertTrue(personaje.tieneLapizArriba());
    }

    @Test
    public void testSeCreaPersonajeYSeBajaLapiz(){
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        assertFalse(personaje.tieneLapizArriba());
    }

    @Test
    public void testSeVuelveASubirLapizLuegoDeBajarlo(){
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        assertTrue(personaje.tieneLapizArriba());
    }

    @Test
    public void testMoverPersonajeHaciaLaDerecha(){
        Personaje personaje = new Personaje();
        Point2D derecha = new Point2D(1, 0);
        personaje.mover("derecha");
        assertEquals(personaje.getPosicion().distance(derecha), 0);
    }

    @Test
    public void testMoverPersonajeHaciaAbajo(){
        Personaje personaje = new Personaje();
        Point2D abajo = new Point2D(0, -1);
        personaje.mover("abajo");
        assertEquals(personaje.getPosicion().distance(abajo), 0);
    }

    @Test
    public void testMoverPersonajeHaciaLaIzquierda(){
        Personaje personaje = new Personaje();
        Point2D izquierda = new Point2D(-1, 0);
        personaje.mover("izquierda");
        assertEquals(personaje.getPosicion().distance(izquierda), 0);
    }

    @Test
    public void testMoverPersonajeHaciaArriba(){
        Personaje personaje = new Personaje();
        Point2D arriba = new Point2D(0, 1);
        personaje.mover("arriba");
        assertEquals(personaje.getPosicion().distance(arriba), 0);
    }

    @Test
    public void testMoverPersonajeEnSentidoHorarioVuelveAlOrigen(){
        Personaje personaje = new Personaje();
        Point2D origen = new Point2D(0, 0);
        personaje.mover("derecha");
        personaje.mover("abajo");
        personaje.mover("izquierda");
        personaje.mover("arriba");
        assertEquals(personaje.getPosicion().distance(origen), 0);
    }
}
