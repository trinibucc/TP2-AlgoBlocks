package edu.fiuba.algo3.Vista.Contenedores;

import edu.fiuba.algo3.Vista.VistaTablero;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;



public class CreadorSectorTablero extends Group {

    private VistaTablero vistaTablero;
    private Canvas canvas;

    public CreadorSectorTablero(ContenedorLapiz lapiz) {

        this.canvas = new Canvas(700,500);
        this.vistaTablero = new VistaTablero(canvas, lapiz);

        canvas.getGraphicsContext2D().strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        this.getChildren().add(canvas);
    }

    public VistaTablero obtenerVistaTablero() {
        return this.vistaTablero;
    }

}
