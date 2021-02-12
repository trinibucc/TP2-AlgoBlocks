package edu.fiuba.algo3.modelo;


public class LapizAbajo implements Lapiz, Bloque {

    @Override
    public void ejecutar(Personaje personaje){
        personaje.bajarLapiz();
    }

    @Override
    public void dibujar(Posicion posicion){
        SectorDibujo.obtenerSectorDibujo().agregarADibujo(posicion);
    }

}
