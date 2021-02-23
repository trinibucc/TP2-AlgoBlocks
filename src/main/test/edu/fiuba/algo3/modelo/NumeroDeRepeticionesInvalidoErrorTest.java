package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumeroDeRepeticionesInvalidoErrorTest {

    @Test
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesNegativasLanzaNumeroDeRepeticionesInvalidoError(){
        assertThrows(NumeroDeRepeticionesInvalidoError.class,
                () -> {
                    BloqueRepetir bloqueRepetir = new BloqueRepetir(-2);
                });
    }

    @Test
    public void testLlamarAlConstructorRecorridoIterativoConRepeticionesPositivasMenorADosLanzaExcepcion(){
        assertThrows(NumeroDeRepeticionesInvalidoError.class,
                () -> {
                    BloqueRepetir bloqueRepetir = new BloqueRepetir(1);
                });
    }
}
