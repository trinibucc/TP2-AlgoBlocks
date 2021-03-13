package edu.fiuba.algo3.modelo.bloques;


import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.dibujo.Posicion;

public class BloqueDerecha implements Bloque {

    private String nombre = "bloqueDerecha";

    private Posicion posicion = new Posicion(1,0);

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicionFinal(posicion);
        personaje.dibujar();
    }

   public Bloque opuesto(){
        return new BloqueIzquierda();
   }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

}
