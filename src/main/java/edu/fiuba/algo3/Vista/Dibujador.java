package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorLapiz;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Segmento;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.List;

public class Dibujador {

    private Canvas tablero;
    private double xpartida = 150;
    private double ypartida = 150;
    private double xllegada = 150;
    private double yllegada = 150;
    private ContenedorLapiz lapiz;


    public Dibujador(Canvas canvas, ContenedorLapiz lapiz) {
        this.tablero = canvas;
        this.lapiz = lapiz;

    }

    public void actualizar() {

        tablero.setVisible(true);
        GraphicsContext graphicsContext = tablero.getGraphicsContext2D();
        graphicsContext.clearRect(0,0,500,500);
        graphicsContext.setLineWidth(5);
        graphicsContext.setStroke(Color.RED);
        Image imagen = new Image("lapizvista.png", 50, 50, true, true);
        List<Segmento> segmentos = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        for (Segmento segmento : segmentos) {
            Posicion inicial = segmento.obtenerInicio();
            Posicion fin = segmento.obtenerFin();
            graphicsContext.setStroke(Color.RED);
            if (inicial.obtenerX() < fin.obtenerX()) {
                xpartida = xpartida - 50;
                graphicsContext.strokeLine(xpartida,ypartida, xllegada,yllegada);
            }
            else if(inicial.obtenerX() > fin.obtenerX()){
                xllegada = xllegada - 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            }
            else if(inicial.obtenerY() > fin.obtenerY()){
                yllegada = yllegada + 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            }
            else{
                yllegada = yllegada - 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            }
            xpartida = xllegada;
            ypartida = yllegada;
            //lapiz.moverLapizA(xllegada, yllegada);
        }

    }

}
