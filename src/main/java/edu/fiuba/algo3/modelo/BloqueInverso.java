package edu.fiuba.algo3.modelo;


import java.util.Collections;
import java.util.List;

public class BloqueInverso extends BloqueIterativo {

    private String nombre = "bloqueInverso";

    public void ejecutar(Personaje personaje){
        this.invertir(this.algoritmo);
        Collections.reverse(this.algoritmo);
        this.recorrer(personaje);
    }

    public Bloque opuesto(){
        return this;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    private void invertir(List<Bloque> algoritmo){
        for(int i = 0; i < algoritmo.size(); i++){
            algoritmo.set(i, algoritmo.get(i).opuesto());
        }
    }



}
