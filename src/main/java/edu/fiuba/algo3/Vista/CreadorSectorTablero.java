package edu.fiuba.algo3.Vista;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;



public class CreadorSectorTablero extends Group {

    private Dibujador dibujador;
    private Canvas canvas;

    public CreadorSectorTablero() {

        this.canvas = new Canvas(500,500);
        this.dibujador = new Dibujador(canvas);

        canvas.getGraphicsContext2D().strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        this.getChildren().add(canvas);
    }

    public Dibujador obtenerDibujador() {
        return this.dibujador;
    }

}
