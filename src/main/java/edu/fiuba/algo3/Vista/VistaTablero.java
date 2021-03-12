package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorLapiz;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Segmento;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class VistaTablero {

    private Canvas tablero;
    private double xpartida = 250;
    private double ypartida = 250;
    private double xllegada = 250;
    private double yllegada = 250;
    private ContenedorLapiz lapiz;


    public VistaTablero(Canvas canvas, ContenedorLapiz lapiz) {

        this.tablero = canvas;
        this.lapiz = lapiz;

    }

    public void actualizar() {

        tablero.setVisible(true);
        GraphicsContext graphicsContext = tablero.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, tablero.getWidth(), tablero.getHeight());
        graphicsContext.setLineWidth(5);
        graphicsContext.setStroke(Color.RED);
        List<Segmento> segmentos = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        for (Segmento segmento : segmentos) {
            Posicion inicial = segmento.obtenerInicio();
            Posicion fin = segmento.obtenerFin();
            graphicsContext.setStroke(Color.RED);
            if (inicial.obtenerX() < fin.obtenerX()) {
                xllegada = xllegada + 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            } else if (inicial.obtenerX() > fin.obtenerX()) {
                xllegada = xllegada - 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            } else if (inicial.obtenerY() > fin.obtenerY()) {
                yllegada = yllegada + 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            } else {
                yllegada = yllegada - 50;
                graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
            }
            xpartida = xllegada;
            ypartida = yllegada;
            lapiz.moverLapizA(xllegada, yllegada);
        }

        List<Segmento> noDibujado = SectorDibujo.obtenerSectorDibujo().obtenerSinTrazar();

        for (Segmento segmentoNoDibujar : noDibujado) {
            Posicion inicio = segmentoNoDibujar.obtenerInicio();
            Posicion fin1 = segmentoNoDibujar.obtenerFin();
            if (inicio.obtenerX() < fin1.obtenerX()) {
                xllegada = xllegada + 50;
            } else if (inicio.obtenerX() > fin1.obtenerX()) {
                xllegada = xllegada - 50;
            } else if (inicio.obtenerY() > fin1.obtenerY()) {
                yllegada = yllegada + 50;
            } else {
                yllegada = yllegada - 50;
            }
            xpartida = xllegada;
            ypartida = yllegada;
            lapiz.moverLapizA(xllegada, yllegada);
        }

    }

}


