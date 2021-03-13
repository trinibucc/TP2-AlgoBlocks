package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ContenedorLapiz extends Canvas {

    static final int TAMANIO = 50;
    static final int ALTURA = 500;
    static final int ANCHO = 700;

    private GraphicsContext gc;
    private Image image;

    private int posicionInicial = 200;


    public ContenedorLapiz(){

        this.image = new Image("lapizvista.png", TAMANIO, TAMANIO, true, true);



        this.gc = this.getGraphicsContext2D();
        gc.drawImage(image, posicionInicial, posicionInicial);
        this.setRotate(180);

    }


}
