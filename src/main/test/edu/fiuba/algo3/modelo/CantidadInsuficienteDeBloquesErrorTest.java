package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.excepciones.CantidadInsuficienteDeBloquesError;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CantidadInsuficienteDeBloquesErrorTest {

    @Test
    public void test01IntentarGuardarUnAlgoritmoSinBloquesLanzaCantidadInsuficienteDeBloquesError(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);
        assertThrows(CantidadInsuficienteDeBloquesError.class,
                ()->{
                    algoBlocks.guardarAlgoritmo("ArribaAbajo");
                });
    }

    @Test
    public void test02AlEjecutarUnAlgoritmoSinBloquesLanzaCantidadInsuficienteDeBloquesError(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        assertThrows(CantidadInsuficienteDeBloquesError.class,
                ()->{
                    algoritmo.ejecutar();
                });

    }
}