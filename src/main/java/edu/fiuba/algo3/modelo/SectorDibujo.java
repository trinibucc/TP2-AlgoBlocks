package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class SectorDibujo {

    private static SectorDibujo instancia = null;
    private List<int[]> dibujo = new ArrayList<>();

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

    public void agregarADibujo(int[] dibuja){
        dibujo.add(dibuja);
    }

    public void trazar(){
        for(int[] posiciones : dibujo){
            System.out.println("Posicion horizontal: " + posiciones[0]);
            System.out.println("Posicion vertical: " + posiciones[1]);
        }
    }

    public int[] obtenerDibujo(){
        return (dibujo.get(0));
    }

}