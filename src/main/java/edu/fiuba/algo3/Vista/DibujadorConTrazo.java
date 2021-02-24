package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Segmento;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;


public class DibujadorConTrazo extends Dibujador {


    public DibujadorConTrazo(Tablero tablero){
        super(tablero);
    }



    protected void actualizar(){
        GraphicsContext graphicsContext  = super.getGraphicsContext2D();
        graphicsContext.clearRect(0,0, this.getHeight(), this.getWidth());
        graphicsContext.strokeRect(0, 0, this.getWidth(), this.getHeight());
        List<Segmento> segmentos = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        graphicsContext.setLineWidth(5);
        graphicsContext.setStroke(Color.BLACK);
        for(Segmento segmento : segmentos) {
            Posicion inicial = segmento.obtenerInicio();
            Posicion fin = segmento.obtenerFin();
            graphicsContext.moveTo(inicial.obtenerX(), inicial.obtenerY());
            graphicsContext.strokeLine(inicial.obtenerX(), inicial.obtenerY(), fin.obtenerX(), fin.obtenerY());

        }

    }
}
