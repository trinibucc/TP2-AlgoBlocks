package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class AlgoBlocks {

    private Personaje personaje;
    private List<Bloque> algoritmo;

    public AlgoBlocks(){
        this.personaje = new Personaje();
        this.algoritmo = new ArrayList<>();
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
}