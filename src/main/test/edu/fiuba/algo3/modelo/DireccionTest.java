package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DireccionTest {

    @Test
    public void crearDireccionConLapizNoDibuja() {
        // Crear direccion y luego validar que por default se haya creado lapiz en no dibuja
        Direccion direccion = new Direccion();
        Lapiz lapiz = direccion.getLapiz();
        assertEquals(false, lapiz.dibuja());
    }

}