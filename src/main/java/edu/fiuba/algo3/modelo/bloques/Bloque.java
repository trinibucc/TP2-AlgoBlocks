package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Personaje;


public interface Bloque {

    void ejecutar(Personaje personaje);

    Bloque opuesto();

    String obtenerNombre();

}
