package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.VistaTablero;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;


public class Tablero extends Group {

    static final int ALTURA = 500;
    static final int ANCHO = 700;

    private VistaTablero vistaTablero;
    private Canvas canvas;

    public Tablero(ContenedorLapiz lapiz) {

        this.canvas = new Canvas(ANCHO, ALTURA);
        this.vistaTablero = new VistaTablero(canvas, lapiz);

       // canvas.getGraphicsContext2D().strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        this.getChildren().add(canvas);
        this.canvas.getGraphicsContext2D().drawImage(new Image("lapizvista.png", 50, 50, true, true), 200, 200);
    }

    public VistaTablero obtenerVistaTablero() {
        return this.vistaTablero;
    }

}
