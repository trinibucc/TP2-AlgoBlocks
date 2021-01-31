package edu.fiuba.algo3.modelo;

import org.junit.Test;

public class NumeroDeRepeticionesInvalidoErrorTest {

    @Test (expected = NumeroDeRepeticionesInvalidoError.class)
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesNegativasLanzaExcepcion(){
        RecorridoIterativo recorridoIterativo = new RecorridoIterativo(-2, new Personaje());
    }

    @Test (expected = NumeroDeRepeticionesInvalidoError.class)
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesPositivasMenorADosLanzaExcepcion(){
        RecorridoIterativo recorridoIterativo = new RecorridoIterativo(1, new Personaje());
    }
}
