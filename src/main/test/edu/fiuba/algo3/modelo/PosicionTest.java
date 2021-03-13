package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.dibujo.Posicion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PosicionTest {

    @Test
    public void test01PosicionSeCreCorrectamente(){
        Posicion posicion = new Posicion(3, 2);
        assertEquals(3,  posicion.obtenerX());
        assertEquals(2, posicion.obtenerY());
    }

    @Test
    public void test02SumarPosicionSeModificaASiMisma(){
        Posicion posicion = new Posicion(2, -1);
        posicion.sumarse(new Posicion(-2, 1));
        assertEquals(0, posicion.obtenerX());
        assertEquals(0, posicion.obtenerX());
    }

    @Test
    public void test03ComparaAtributosXYContraOtraPosicionDevuelveTrue(){
        assertTrue(new Posicion(27, 12).esIgualA(new Posicion(27, 12)));
    }

    @Test
    public void test04EsIgualAComparaDosPosicionesDiferentesDevuelveFalse(){
        assertFalse(new Posicion(1,0).esIgualA(new Posicion(0,1)));
    }

    @Test
    public void test05SumarPosicionSumaValoresDePosicionConOtrsoValores(){
        Posicion posicion = new Posicion(1,1);
        Posicion otraPosicion = new Posicion(0,1);
        posicion.sumarse(otraPosicion);
        assertTrue(posicion.esIgualA(new Posicion(1,2)));
    }

}
