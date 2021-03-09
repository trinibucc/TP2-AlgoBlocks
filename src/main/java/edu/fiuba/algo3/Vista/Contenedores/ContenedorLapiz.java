package edu.fiuba.algo3.Vista.Contenedores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ContenedorLapiz extends ImageView {


    public ContenedorLapiz(){
        Image image = new Image("lapizvista.png", 50, 50, true, true);
        this.setImage(image);
        this.setLayoutX(150);
        this.setLayoutY(150);

    }

    public void moverLapizA(double x, double y){

        this.setLayoutX(x);
        this.setLayoutY(y);
    }

    public void subirLapiz(){

        this.setRotate(180);
    }


}
