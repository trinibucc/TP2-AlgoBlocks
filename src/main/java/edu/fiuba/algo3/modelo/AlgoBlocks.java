package edu.fiuba.algo3.modelo;

import java.util.List;


public class AlgoBlocks {

    private final Personaje personaje;
    private final List<Bloque> algoritmo;

    public AlgoBlocks(List<Bloque> recorrido, Personaje personaje){
        this.personaje = personaje;
        this.algoritmo = recorrido;
    }

    public void agregarLapizArriba() {
        LapizArriba lapizArriba = new LapizArriba();
        this.algoritmo.add(lapizArriba);
    }

    public void ejecutar() {
        for(Bloque bloque : this.algoritmo){
            bloque.ejecutar(this.personaje);
        }
    }

    public Personaje obtenerPersonaje() {
        return this.personaje;
    }

    public void agregarLapizAbajo() {
        LapizAbajo lapizAbajo = new LapizAbajo();
        this.algoritmo.add(lapizAbajo);
    }

    public void agregarBloqueDerecha() {
        Bloque bloqueDerecha = new BloqueDerecha();
        this.algoritmo.add(bloqueDerecha);
    }

    public void agregarBloqueAbajo() {
        Bloque bloqueAbajo = new BloqueAbajo();
        this.algoritmo.add(bloqueAbajo);
    }

    public void agregarBloqueIzquierda() {
        Bloque bloqueIzquierda = new BloqueIzquierda();
        this.algoritmo.add(bloqueIzquierda);
    }

    public void agregarBloqueArriba() {
        Bloque bloqueArriba = new BloqueArriba();
        this.algoritmo.add(bloqueArriba);
    }

    protected BloqueRepetir agregarBloqueRepetirDosVeces(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2, personaje);
        this.algoritmo.add(bloqueRepetir);
        return bloqueRepetir;
    }

    public BloqueRepetir agregarBloqueRepetirTresVeces(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(3, personaje);
        this.algoritmo.add(bloqueRepetir);
        return bloqueRepetir;
    }

    public BloqueInverso agregarBloqueInverso(){
        BloqueInverso bloqueInverso = new BloqueInverso(personaje);
        this.algoritmo.add(bloqueInverso);
        return bloqueInverso;
    }

}