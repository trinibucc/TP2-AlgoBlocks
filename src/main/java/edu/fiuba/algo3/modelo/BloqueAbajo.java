package edu.fiuba.algo3.modelo;


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
