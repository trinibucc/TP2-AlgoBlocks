package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class LapizAbajo implements Lapiz, Bloque {

    @Override
    public void ejecutar(Personaje personaje){
        personaje.bajarLapiz();
    }

    @Override
    public void dibujar(int[] posicion){

        SectorDibujo.obtenerSectorDibujo().agregarADibujo(posicion);
    }
}
