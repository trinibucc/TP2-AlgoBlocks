package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SegmentoInvalidoErrorTest {

    @Test
    public void test01CrearUnSegmentoConPuntosIgualesLanzaSegmentoInvalidoError(){
        assertThrows(SegmentoInvalidoError.class,
                () -> {
                    new Segmento(new Posicion(2, 3), new Posicion(2, 3));
                });
    }

}
