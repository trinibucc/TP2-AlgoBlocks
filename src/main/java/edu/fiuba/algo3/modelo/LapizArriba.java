package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class LapizArriba implements Lapiz, Bloque{
    List<int[]> noDibuja = new ArrayList<>();

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }

    @Override
    public void dibujar(int[] posicion) {
        noDibuja.add(posicion);

    }
}
