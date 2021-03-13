package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.vista.contenedores.ContenedorLapiz;
import edu.fiuba.algo3.modelo.dibujo.Posicion;
import edu.fiuba.algo3.modelo.dibujo.SectorDibujo;
import edu.fiuba.algo3.modelo.dibujo.Segmento;
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
    private double movimiento = 50;


    public VistaTablero(Canvas canvas, ContenedorLapiz lapiz) {

        this.tablero = canvas;
        this.lapiz = lapiz;

    }

    public void actualizar() {

        tablero.setVisible(true);
        GraphicsContext graphicsContext = tablero.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, tablero.getWidth(), tablero.getHeight());
        graphicsContext.setLineWidth(5);
        graphicsContext.setStroke(Color.BLACK);


        List<Segmento> segmentosDibujados = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        this.recorrerSegmentos(segmentosDibujados, graphicsContext, true);

        List<Segmento> noDibujados = SectorDibujo.obtenerSectorDibujo().obtenerSinTrazar();
        this.recorrerSegmentos(noDibujados, graphicsContext, false);

    }


    private void recorrerSegmentos(List<Segmento> segmentos, GraphicsContext gc, Boolean traza){

        for(Segmento segmento : segmentos){
            Posicion inicio = segmento.obtenerInicio();
            Posicion fin = segmento.obtenerFin();
            if(traza == true){
                this.trazarMovimiento(inicio, fin, gc);
            }
            else{
                this.moverSinTrazar(inicio, fin);
            }
            xpartida = xllegada;
            ypartida = yllegada;
            lapiz.moverLapizA(xllegada, yllegada);
        }
    }

    private void trazarMovimiento(Posicion inicio, Posicion fin, GraphicsContext graphicsContext){

        if (inicio.obtenerX() < fin.obtenerX()) {
            xllegada = xllegada + movimiento;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        } else if (inicio.obtenerX() > fin.obtenerX()) {
            xllegada = xllegada - movimiento;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        } else if (inicio.obtenerY() > fin.obtenerY()) {
            yllegada = yllegada + movimiento;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        } else {
            yllegada = yllegada - movimiento;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        }

    }

    private void moverSinTrazar(Posicion inicio, Posicion fin){

        if (inicio.obtenerX() < fin.obtenerX()) {
            xllegada = xllegada + movimiento;
        } else if (inicio.obtenerX() > fin.obtenerX()) {
            xllegada = xllegada - movimiento;
        } else if (inicio.obtenerY() > fin.obtenerY()) {
            yllegada = yllegada + movimiento;
        } else {
            yllegada = yllegada - movimiento;
        }

    }

}


