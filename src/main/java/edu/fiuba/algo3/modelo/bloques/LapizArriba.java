package edu.fiuba.algo3.modelo.bloques;


import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.dibujo.Posicion;
import edu.fiuba.algo3.modelo.dibujo.SectorDibujo;

public class LapizArriba implements Lapiz, Bloque {

    private String nombre = "lapizArriba";

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }

    @Override
    public void trazar(Posicion posicionInicial, Posicion posicionFinal) {

        SectorDibujo.obtenerSectorDibujo().noAplicarTrazo(posicionInicial, posicionFinal);
    }

    public Bloque opuesto(){
        return new LapizAbajo();
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

}
