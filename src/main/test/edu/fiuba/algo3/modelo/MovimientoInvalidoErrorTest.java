package edu.fiuba.algo3.modelo;

import org.junit.Test;

import java.lang.reflect.Executable;

public class MovimientoInvalidoErrorTest {

    @Test (expected = MovimientoInvalidoError.class)
    public void testActualizarPosicionDelPersonajeConModuloMayorAUnoLanzaExcepcion(){
        Personaje personaje = new Personaje();
        int[] movimiento = {1, 3};
        personaje.actualizarPosicion(movimiento);
    }

    @Test (expected = MovimientoInvalidoError.class)
    public void testActualizrPosicionDelPersonajeConModuloCeroLanzaExcepcion(){
        Personaje personaje = new Personaje();
        int[] movimiento = {0, 0};
        personaje.actualizarPosicion(movimiento);
    }


}
