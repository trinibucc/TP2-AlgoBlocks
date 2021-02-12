package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class LapizArriba implements Lapiz, Bloque{

    List<Posicion> noDibuja = new ArrayList<>();

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }

    @Override
    public void dibujar(Posicion posicion) {
        noDibuja.add(posicion);
    }

}
