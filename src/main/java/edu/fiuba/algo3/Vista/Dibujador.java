package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Segmento;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Dibujador {

    private Canvas tablero;


    public Dibujador(Canvas canvas) {
        this.tablero = canvas;

    }


    public void actualizar() {
        GraphicsContext graphicsContext = tablero.getGraphicsContext2D();

        List<Segmento> segmentos = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        for (Segmento segmento : segmentos) {
            Posicion inicial = segmento.obtenerInicio();
            Posicion fin = segmento.obtenerFin();
            graphicsContext.setFill(Color.RED);
            graphicsContext.fillRect(inicial.obtenerX(), inicial.obtenerY(), fin.obtenerX(), fin.obtenerY());
            graphicsContext.stroke();
        }

    }

}
