package edu.fiuba.algo3.modelo.bloques;


import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.dibujo.Posicion;
import edu.fiuba.algo3.modelo.dibujo.SectorDibujo;

public class LapizAbajo implements Lapiz, Bloque {

    private String nombre = "lapizAbajo";

    @Override
    public void ejecutar(Personaje personaje){
        personaje.bajarLapiz();
    }

    @Override

    public void trazar(Posicion posicionInicial, Posicion posicionFinal){
        SectorDibujo sectorDibujo = SectorDibujo.obtenerSectorDibujo();
        sectorDibujo.aplicarTrazo(posicionInicial, posicionFinal);
    }

    public Bloque opuesto(){
        return new LapizArriba();
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
}
