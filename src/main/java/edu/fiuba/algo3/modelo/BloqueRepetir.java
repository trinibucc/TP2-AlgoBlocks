package edu.fiuba.algo3.modelo;

public class BloqueRepetir implements Bloque {

    RecorridoIterativo iterativo;

    public BloqueRepetir(RecorridoIterativo iterativo) {
        this.iterativo = iterativo;

    }

    @Override
    public void ejecutar(Personaje personaje) {
        iterativo.ejecutar();
    }
}
