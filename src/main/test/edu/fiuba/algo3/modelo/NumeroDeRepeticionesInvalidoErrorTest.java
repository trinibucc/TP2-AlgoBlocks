package edu.fiuba.algo3.modelo;

import org.junit.Test;

public class NumeroDeRepeticionesInvalidoErrorTest {

    @Test (expected = NumeroDeRepeticionesInvalidoError.class)
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesNegativasLanzaExcepcion(){
        new BloqueRepetir(-2, new Personaje());
    }

    @Test (expected = NumeroDeRepeticionesInvalidoError.class)
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesPositivasMenorADosLanzaExcepcion(){
        new BloqueRepetir(1, new Personaje());
    }
}
