package edu.fiuba.algo3.Vista.Contenedores;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ContenedorLapiz extends Canvas {

    private GraphicsContext gc;
    private Image image;


    public ContenedorLapiz(){

        this.image = new Image("lapizvista.png", 50, 50, true, true);

        this.setHeight(700);
        this.setWidth(500);
        this.gc = this.getGraphicsContext2D();
        gc.drawImage(image, 250, 250);

    }

    public void moverLapizA(double x, double y){

        gc.clearRect(0, 0, this.getWidth(), this.getHeight());
        gc.drawImage(image, x, y);
    }

    public void subirLapiz(){

        this.setRotate(180);
    }


}
