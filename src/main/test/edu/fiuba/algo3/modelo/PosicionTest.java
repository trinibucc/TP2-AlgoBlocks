package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosicionTest {

    @Test
    public void testPosicionSeCreCorrectamente(){
        Posicion posicion = new Posicion(3, 2);
        assertEquals(3,  posicion.obtenerX());
        assertEquals(2, posicion.obtenerY());
    }

    @Test
    public void testSumarPosicionSeModificaASiMisma(){
        Posicion posicion = new Posicion(2, -1);
        posicion.sumarse(new Posicion(-2, 1));
        assertEquals(0, posicion.obtenerX());
        assertEquals(0, posicion.obtenerX());
    }

    @Test
    public void testComparaAtributosXYContraOtraPosicionDevuelveTrue(){
        assertTrue(new Posicion(27, 12).esIgualA(new Posicion(27, 12)));
    }



}
