package edu.fiuba.algo3.modelo.bloques;


import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.dibujo.Posicion;

public class BloqueAbajo implements Bloque {

    private String nombre = "bloqueAbajo";

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicionFinal(new Posicion(0, -1));
        personaje.dibujar();
    }

    public Bloque opuesto(){
        return new BloqueArriba();
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }


}
