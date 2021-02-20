package edu.fiuba.algo3.modelo;


public class BloqueDerecha implements Bloque {

    private Posicion posicion = new Posicion(1,0);

    public void ejecutar(Personaje personaje){
        personaje.actualizarPosicionFinal(posicion);
        personaje.dibujar();
    }

   public Bloque opuesto(){
        return new BloqueIzquierda();
   }

}
