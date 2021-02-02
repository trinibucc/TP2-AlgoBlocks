package edu.fiuba.algo3.modelo;

public class BloqueInverso implements Bloque {

    RecorridoInverso recorridoInverso;
    public BloqueInverso(RecorridoInverso  recorridoInverso) {
        this.recorridoInverso = recorridoInverso;
    }

    @Override
    public void ejecutar(Personaje personaje) {
        recorridoInverso.ejecutar();
    }
}
