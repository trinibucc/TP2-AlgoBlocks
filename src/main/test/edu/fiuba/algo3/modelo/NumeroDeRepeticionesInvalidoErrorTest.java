package edu.fiuba.algo3.modelo;

import org.junit.Test;

public class NumeroDeRepeticionesInvalidoErrorTest {

    @Test (expected = NumeroDeRepeticionesInvalidoError.class)
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesNegativasLanzaExcepcion(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(-2);
    }

    @Test (expected = NumeroDeRepeticionesInvalidoError.class)
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesPositivasMenorADosLanzaExcepcion(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(1);
    }
}
