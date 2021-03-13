package edu.fiuba.algo3.modelo.bloques;


import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.dibujo.Posicion;

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
