package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.dibujo.Posicion;
import edu.fiuba.algo3.modelo.dibujo.SectorDibujo;
import edu.fiuba.algo3.modelo.dibujo.Segmento;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;


public class VistaTablero implements Observer {

    static final int MOVIMIENTO = 25;
    static final int TAMANIO = 50;

    private Canvas tablero;
    private double xpartida = 200;
    private double ypartida = 200;
    private double xllegada = 200;
    private double yllegada = 200;




    public VistaTablero(Canvas canvas) {

        this.tablero = canvas;
    }

    public void update() {

        tablero.setVisible(true);
        GraphicsContext graphicsContext = tablero.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, tablero.getWidth(), tablero.getHeight());
        graphicsContext.setLineWidth(5);


        List<Segmento> segmentosDibujados = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        List<Segmento> noDibujados = SectorDibujo.obtenerSectorDibujo().obtenerSinTrazar();
        if(segmentosDibujados.isEmpty() == false && noDibujados.isEmpty() == false) {
            if (segmentosDibujados.get(0).obtenerInicio().obtenerX() < noDibujados.get(0).obtenerInicio().obtenerX()
                    || segmentosDibujados.get(0).obtenerInicio().obtenerY() < noDibujados.get(0).obtenerInicio().obtenerY()) {
                this.recorrerSegmentos(segmentosDibujados, graphicsContext, true);
                this.recorrerSegmentos(noDibujados, graphicsContext, false);
            } else {
                this.recorrerSegmentos(noDibujados, graphicsContext, false);
                this.recorrerSegmentos(segmentosDibujados, graphicsContext, true);
            }
        }
        else if(segmentosDibujados.isEmpty() == true && noDibujados.isEmpty() == false){
            this.recorrerSegmentos(noDibujados, graphicsContext, false);
        }
        else{
            this.recorrerSegmentos(segmentosDibujados, graphicsContext, true);
        }
    }


    private void recorrerSegmentos(List<Segmento> segmentos, GraphicsContext gc, Boolean traza){

        for(Segmento segmento : segmentos){
            Posicion inicio = segmento.obtenerInicio();
            Posicion fin = segmento.obtenerFin();
            if(traza == true){
                gc.setStroke(Color.BLACK);
                this.trazarMovimiento(inicio, fin, gc);
            }
            else{
                gc.setStroke(Color.LIGHTGRAY);
                this.trazarMovimiento(inicio, fin, gc);
            }
            xpartida = xllegada;
            ypartida = yllegada;
        }

    }

    private void trazarMovimiento(Posicion inicio, Posicion fin, GraphicsContext graphicsContext){

        if (inicio.obtenerX() < fin.obtenerX()) {
            xllegada = xllegada + MOVIMIENTO;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        } else if (inicio.obtenerX() > fin.obtenerX()) {
            xllegada = xllegada - MOVIMIENTO;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        } else if (inicio.obtenerY() > fin.obtenerY()) {
            yllegada = yllegada + MOVIMIENTO;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        } else if (inicio.obtenerY() < fin.obtenerY()){
            yllegada = yllegada - MOVIMIENTO;
            graphicsContext.strokeLine(xpartida, ypartida, xllegada, yllegada);
        }

    }

    public void reiniciar() {
        xpartida = 200;
        ypartida = 200;
        xllegada = 200;
        yllegada = 200;
        this.update();
    }
}


