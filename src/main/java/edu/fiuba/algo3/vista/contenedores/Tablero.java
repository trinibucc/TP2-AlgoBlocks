package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.VistaTablero;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;


public class Tablero extends Group {

    static final int ALTURA = 500;
    static final int ANCHO = 700;

    private VistaTablero vistaTablero;
    private Canvas canvas;

    public Tablero() {

        this.canvas = new Canvas(ANCHO, ALTURA);
        this.vistaTablero = new VistaTablero(canvas);

        this.getChildren().add(canvas);

    }

    public VistaTablero obtenerVistaTablero() {
        return this.vistaTablero;
    }

}
