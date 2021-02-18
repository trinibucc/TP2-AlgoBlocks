package edu.fiuba.algo3.modelo;

public class Segmento {

    private Posicion inicio;
    private Posicion fin;

    public Segmento(Posicion inicio, Posicion fin){
        if(inicio.esIgualA(fin)){
            throw new SegmentoInvalidoError();
        }
        this.inicio = new Posicion(inicio.obtenerX(), inicio.obtenerY());
        this.fin = new Posicion(fin.obtenerX(), fin.obtenerY());
    }

    public boolean esIgualA(Segmento segmento){
        return segmento.obtenerInicio().esIgualA(this.inicio) && segmento.obtenerFin().esIgualA(this.fin);
    }

    public Posicion obtenerInicio() {
        return this.inicio;
    }

    public Posicion obtenerFin(){
        return this.fin;
    }

}
