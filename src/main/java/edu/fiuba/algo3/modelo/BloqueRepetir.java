package edu.fiuba.algo3.modelo;


public class BloqueRepetir extends BloqueIterativo {

    private int repeticion;

    public BloqueRepetir(int repeticion) {
        if(repeticion < 2){
            throw new NumeroDeRepeticionesInvalidoError();
        }
        this.repeticion = repeticion;

    }


    public void ejecutar(Personaje personaje){
        int repetido = 0;
        while(repetido < this.repeticion){
            this.recorrer(personaje);
            repetido++;
        }
    }

}
