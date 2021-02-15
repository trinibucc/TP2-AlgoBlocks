package edu.fiuba.algo3.modelo;

public class Segmento {

    private Posicion inicio;
    private Posicion fin;

    public Segmento(Posicion inicio, Posicion fin){
        this.inicio = new Posicion(inicio.obtenerX(), inicio.obtenerY());
        this.fin = new Posicion(fin.obtenerX(), fin.obtenerY());
    }

    public boolean esIgualA(Segmento trazo){
        return trazo.obtenerInicio().esIgualA(this.inicio) && trazo.obtenerFin().esIgualA(this.fin);
    }

    private Posicion obtenerInicio() {
        return this.inicio;
    }

    private Posicion obtenerFin(){
        return this.fin;
    }

}
