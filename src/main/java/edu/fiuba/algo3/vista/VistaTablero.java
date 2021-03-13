package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.vista.contenedores.ContenedorLapiz;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.dibujo.Posicion;
import edu.fiuba.algo3.modelo.dibujo.SectorDibujo;
import edu.fiuba.algo3.modelo.dibujo.Segmento;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
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
    private ContenedorLapiz lapiz;



    public VistaTablero(Canvas canvas, ContenedorLapiz lapiz) {

        this.tablero = canvas;
        this.lapiz = lapiz;

    }

    public void update() {

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
            this.updateLapiz();
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

    private void moverSinTrazar(Posicion inicio, Posicion fin){

        if (inicio.obtenerX() < fin.obtenerX()) {
            xllegada = xllegada + MOVIMIENTO;
        } else if (inicio.obtenerX() > fin.obtenerX()) {
            xllegada = xllegada - MOVIMIENTO;
        } else if (inicio.obtenerY() > fin.obtenerY()) {
            yllegada = yllegada + MOVIMIENTO;
        } else if (inicio.obtenerY() < fin.obtenerY()) {
            yllegada = yllegada - MOVIMIENTO;
        }

    }

    private void updateLapiz(){

        lapiz.getGraphicsContext2D().clearRect(0, 0, lapiz.getWidth(), lapiz.getHeight());
        lapiz.getGraphicsContext2D().drawImage(new Image("lapizvista.png", TAMANIO, TAMANIO, true, true),
                xllegada, yllegada);

    }

    public void reiniciar() {
        xpartida = 250;
        ypartida = 250;
        xllegada = 250;
        yllegada = 250;
        this.update();
    }
}


