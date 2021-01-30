package edu.fiuba.algo3.modelo;

public class SectorDibujo {

    private static SectorDibujo instancia = null;

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
}
