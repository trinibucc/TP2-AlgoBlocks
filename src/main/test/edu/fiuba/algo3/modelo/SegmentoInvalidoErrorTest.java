package edu.fiuba.algo3.modelo;

import org.junit.Test;

public class SegmentoInvalidoErrorTest {

    @Test (expected = SegmentoInvalidoError.class)
    public void test01CrearUnSegmentoConPuntosIgualesLanzaSegmentoInvalidoError(){
        new Segmento(new Posicion(2, 3), new Posicion(2, 3));
    }
}
