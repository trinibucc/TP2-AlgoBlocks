package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Direccion {
    private final ArrayList<Posicion> ListaMovimientos;
    private Lapiz lapiz;

    public Direccion() {
        this.ListaMovimientos = new ArrayList<Posicion>();
        this.lapiz = new NoDibuja();
    };

    public Lapiz getLapiz() {
        return this.lapiz;
    };

    public boolean ConLapizArriba() {
        return this.lapiz.dibuja();
    }

    public void bajarLapiz() {
        this.lapiz = new Dibuja();
    }

    public void subirLapiz() {
        this.lapiz = new NoDibuja();
    }

    public Posicion mover(Posicion posicion, String direccion) {
        return mover(posicion, direccion);
    }
}