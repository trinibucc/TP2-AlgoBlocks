package edu.fiuba.algo3.modelo;

public class LapizAbajo implements Lapiz, Bloque{

    @Override
    public void ejecutar(Personaje personaje){
        personaje.bajarLapiz();
    }

    @Override
    public void dibujar(int[] posicion){

    }
}
