package edu.fiuba.algo3.Vista.Contenedores;

import edu.fiuba.algo3.Vista.VistaTablero;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;



public class Tablero extends Group {

    static final int ALTURA = 500;
    static final int ANCHO = 700;

    private VistaTablero vistaTablero;
    private Canvas canvas;

    public Tablero(ContenedorLapiz lapiz) {

        this.canvas = new Canvas(ANCHO, ALTURA);
        this.vistaTablero = new VistaTablero(canvas, lapiz);

        canvas.getGraphicsContext2D().strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        this.getChildren().add(canvas);
    }

    public VistaTablero obtenerVistaTablero() {
        return this.vistaTablero;
    }

}
