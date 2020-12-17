package edu.fiuba.algo3.modelo;

interface Lapiz {
    abstract Posicion mover(Posicion pos, String str);
    abstract boolean dibuja();
}