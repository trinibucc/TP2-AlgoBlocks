package edu.fiuba.algo3.modelo;


public class BloqueIzquierda implements Bloque {

    private String nombre = "bloqueIzquierda";

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.actualizarPosicionFinal(new Posicion(-1, 0 ));
        personaje.dibujar();
    }

    public Bloque opuesto(){
        return new BloqueDerecha();
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

}
