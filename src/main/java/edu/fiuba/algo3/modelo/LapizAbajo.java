package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class LapizAbajo implements Lapiz, Bloque {
    private List<int[]> noDibuja = new ArrayList<>();

    @Override
    public void ejecutar(Personaje personaje){
        personaje.bajarLapiz();
    }

    @Override
    public void dibujar(int[] posicion){
        noDibuja.add(posicion);
    }
}
