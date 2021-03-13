package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.bloques.LapizAbajo;
import edu.fiuba.algo3.modelo.bloques.LapizArriba;
import edu.fiuba.algo3.modelo.dibujo.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonajeTest {

    @Test
    public void test01SeCreaPersonajeConElLapizArriba() {
        Personaje personaje = new Personaje();
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test02BajarLapizDelPersonaje(){
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        assertTrue(personaje.obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void test03BajarLapizDelPersonajeYVolverASubirlo(){
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test04PersonajeSeCreaEnLaPosicionDelOrigenCorrecta(){
        Posicion posicion = new Posicion(0, 0);
        Personaje personaje = new Personaje();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test05ActualizarPosicionDelPersonajeLaPosicionInicialYFinalSonCorrectas(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(new Posicion(1, 0)));
    }

}