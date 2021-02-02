package edu.fiuba.algo3.modelo;

import org.junit.Test;


public class MovimientoInvalidoErrorTest {

    @Test (expected = MovimientoInvalidoError.class)
    public void testActualizarPosicionDelPersonajeConModuloMayorAUnoLanzaExcepcion(){
        int[] posicion = {1, 3};
        Personaje personaje = new Personaje();
        personaje.actualizarPosicion(posicion);
    }

    @Test (expected = MovimientoInvalidoError.class)
    public void testActualizrPosicionDelPersonajeConModuloCeroLanzaExcepcion(){
        int[] posicion = {0, 0};
        Personaje personaje = new Personaje();
        personaje.actualizarPosicion(posicion);
    }

}