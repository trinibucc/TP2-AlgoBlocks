package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.excepciones.NumeroDeRepeticionesInvalidoError;


public class BloqueRepetir extends BloqueIterativo {

    private int repeticion;
    private String nombre;

    public BloqueRepetir(int repeticion, String nombre) {
        if(repeticion < 2){
            throw new NumeroDeRepeticionesInvalidoError();
        }
        this.repeticion = repeticion;
        this.nombre = nombre;

    }


    public void ejecutar(Personaje personaje){
        int repetido = 0;
        while(repetido < this.repeticion){
            this.recorrer(personaje);
            repetido++;
        }
    }

    public Bloque opuesto(){
        return this;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

}
