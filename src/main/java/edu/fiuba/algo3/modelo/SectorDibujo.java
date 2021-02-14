package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class SectorDibujo {

    private static SectorDibujo instancia = null;
    private List<Posicion> dibujo = new ArrayList<>();

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

    public void agregarADibujo(Posicion posicion){
        this.dibujo.add(posicion);
    }

    public void trazar(){
        for(Posicion posicion : dibujo){
            System.out.println("Posicion horizontal: " + posicion.obtenerX());
            System.out.println("Posicion vertical: " + posicion.obtenerY());
        }
    }

    public Posicion obtenerDibujo(){
        return (dibujo.get(0));
    }

}