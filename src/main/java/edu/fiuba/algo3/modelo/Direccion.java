package edu.fiuba.algo3.modelo;
import java.util.ArrayList;

public class Direccion {
    private final ArrayList<Posicion> ListaMovimientos;
    private final Lapiz Lapiz;

    public Direccion() {
        this.ListaMovimientos = new ArrayList<Posicion>();
        this.Lapiz = new NoDibuja();
    };

    public Lapiz getLapiz() {
        return this.Lapiz;
    };

}