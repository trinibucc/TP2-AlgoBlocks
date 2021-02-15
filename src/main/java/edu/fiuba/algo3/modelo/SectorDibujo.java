package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class SectorDibujo {

    private static SectorDibujo instancia = null;
    private List<Segmento> trazos = new ArrayList<>();

    private SectorDibujo(){ }

    private synchronized static void crearInstancia(){
        if(instancia == null){
            instancia = new SectorDibujo();
        }
    }

    public static SectorDibujo obtenerSectorDibujo(){
        if(instancia == null){
            crearInstancia();
        }
        return instancia;
    }

    public void resetear(){
        this.trazos = new ArrayList<>();
    }

    public void aplicarTrazo(Posicion posicionInicial, Posicion posicionFinal) {
        this.trazos.add(new Segmento(posicionInicial, posicionFinal));
    }

    public List<Segmento> obtenerDibujo() {
        return this.trazos;
    }
}