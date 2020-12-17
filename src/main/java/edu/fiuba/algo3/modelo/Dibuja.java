package edu.fiuba.algo3.modelo;

public class Dibuja implements Lapiz{

    public Dibuja() { }

    public Posicion mover(Posicion pos, String str) {
        Posicion newPos = new Posicion();
        switch(str)
        {
            case "arriba" :
                //Posicion.obtenerCoordenadas()
                break;

            case "abajo" :
                break;

            case "derecha" :
                break;

            case "izquierda" :
                break;
        }

        return newPos;

    };
    public boolean dibuja(){
        return true;
    }
}