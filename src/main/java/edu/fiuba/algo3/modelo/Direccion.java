package edu.fiuba.algo3.modelo;
import javafx.geometry.Point2D;

import java.util.ArrayList;

public class Direccion {
    private final ArrayList<Posicion> ListaMovimientos;
    private Lapiz Lapiz;

    public Direccion() {
        this.ListaMovimientos = new ArrayList<Posicion>();
        this.Lapiz = new NoDibuja();
    };

    public Lapiz getLapiz() {
        return this.Lapiz;
    };

    public boolean ConLapizArriba() {
        return this.Lapiz.dibuja();
    }

    public void bajarLapiz() {
        this.Lapiz = new Dibuja();
    }

    public void subirLapiz() {
        this.Lapiz = new NoDibuja();
    }

    public Point2D mover(Posicion posicion, String direccion) {
        return mover(posicion, direccion);
    }
}