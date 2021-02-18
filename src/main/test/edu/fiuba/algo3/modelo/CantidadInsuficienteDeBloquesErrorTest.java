package edu.fiuba.algo3.modelo;

import org.junit.Test;

public class CantidadInsuficienteDeBloquesErrorTest {

    @Test (expected = CantidadInsuficienteDeBloquesError.class)
    public void test01IntentarGuardarUnAlgoritmoSinBloquesLanzaCantidadInsuficienteDeBloquesError(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);
        algoBlocks.guardarAlgoritmo("ArribaAbajo");
    }

    @Test (expected = CantidadInsuficienteDeBloquesError.class)
    public void test02AlEjecutarUnAlgoritmoSinBloquesLanzaCantidadInsuficienteDeBloquesError(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        algoritmo.ejecutar();
    }
}
