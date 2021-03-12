package edu.fiuba.algo3.modelo;


public class LapizArriba implements Lapiz, Bloque{

    private String nombre = "lapizArriba";

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.subirLapiz();
    }

    @Override
    public void trazar(Posicion posicionInicial, Posicion posicionFinal) {
    }

    public Bloque opuesto(){
        return new LapizAbajo();
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

}
