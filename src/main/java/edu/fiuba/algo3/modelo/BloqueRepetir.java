package edu.fiuba.algo3.modelo;



public class BloqueRepetir extends BloqueIterativo {


    private int repeticion;

    public BloqueRepetir(int repeticion, Personaje personaje) {
        if(repeticion < 2){
            throw new NumeroDeRepeticionesInvalidoError();
        }
        this.repeticion = repeticion;
        this.personaje = personaje;
    }

    public void ejecutar(Personaje personaje){
        int repetido = 0;
        while(repetido < this.repeticion){
            this.recorrer(personaje);
            repetido++;
        }
    }

}
