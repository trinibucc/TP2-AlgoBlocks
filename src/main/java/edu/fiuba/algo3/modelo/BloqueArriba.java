package edu.fiuba.algo3.modelo;


public class BloqueArriba implements Bloque {

    private String nombre = "bloqueArriba";

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.actualizarPosicionFinal(new Posicion(0, 1));
        personaje.dibujar();
    }

    @Override
    public Bloque opuesto() {
        return new BloqueAbajo();
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
}
