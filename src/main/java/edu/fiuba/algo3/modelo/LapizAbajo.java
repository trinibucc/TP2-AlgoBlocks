package edu.fiuba.algo3.modelo;


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
