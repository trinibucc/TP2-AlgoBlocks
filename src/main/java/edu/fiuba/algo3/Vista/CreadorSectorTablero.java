package edu.fiuba.algo3.Vista;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;



public class CreadorSectorTablero extends Group {
    private Dibujador dibujador;

    public CreadorSectorTablero() {

        this.dibujador = new DibujadorConTrazo(new Tablero(dibujador));
        dibujador.setHeight(500);
        dibujador.setWidth(500);

        GraphicsContext graphicsContext = dibujador.getGraphicsContext2D();
        graphicsContext.strokeRect(0, 0, dibujador.getWidth(), dibujador.getHeight());
        this.getChildren().add(dibujador);
    }

    public Dibujador obtenerDibujador() {
        return this.dibujador;
    }

}
