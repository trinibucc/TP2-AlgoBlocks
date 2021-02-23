package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumeroDeRepeticionesInvalidoErrorTest {

    @Test
    public void test01LlamarAlConstructorRecorridoIterativoConRepeticionesNegativasLanzaNumeroDeRepeticionesInvalidoError(){
        assertThrows(NumeroDeRepeticionesInvalidoError.class,
                () -> {
                    new BloqueRepetir(-2);
                });
    }

    @Test
    public void test02LlamarAlConstructorRecorridoIterativoConRepeticionesPositivasMenorADosLanzaExcepcion(){
        assertThrows(NumeroDeRepeticionesInvalidoError.class,
                () -> {
                    new BloqueRepetir(1);
                });
    }
}
