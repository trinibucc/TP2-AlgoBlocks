package edu.fiuba.algo3.modelo.dibujo;

import java.util.ArrayList;
import java.util.List;


public class SectorDibujo {

    private static SectorDibujo instancia = null;
    private List<Segmento> trazos = new ArrayList<>();
    private List<Segmento> sinTrazar = new ArrayList<>();

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

    public void reiniciar(){
        this.trazos = new ArrayList<>();
    }

    public void aplicarTrazo(Posicion posicionInicial, Posicion posicionFinal) {
        this.trazos.add(new Segmento(posicionInicial, posicionFinal));
    }

    public void noAplicarTrazo(Posicion posicionInicial, Posicion posicionFinal){
        this.sinTrazar.add(new Segmento(posicionInicial, posicionFinal));
    }

    public List<Segmento> obtenerSinTrazar(){
        return sinTrazar;
    }

    public List<Segmento> obtenerDibujo() {
        return this.trazos;
    }
}