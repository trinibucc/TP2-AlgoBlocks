package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Algoritmo;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Segmento;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.util.List;


public class Ejecutar implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;
    private LineChart tablero;

    public Ejecutar(Algoritmo algoritmo, LineChart tablero){
        this.algoritmo = algoritmo;
        this.tablero = tablero;
    }

    @Override
    public void handle(ActionEvent Event){
        algoritmo.ejecutar();
        XYChart.Series<Double, Double> series = new XYChart.Series<>();
        List<Segmento> trazos = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        for(Segmento segmento : trazos){
            Posicion inicio = segmento.obtenerFin();
            Posicion fin = segmento.obtenerFin();
            series.getData().add(new XYChart.Data<>(inicio.obtenerX(), inicio.obtenerY()));
            series.getData().add(new XYChart.Data<>(fin.obtenerX(), fin.obtenerY()));

        }
        tablero.getData().add(series);

    }
}
