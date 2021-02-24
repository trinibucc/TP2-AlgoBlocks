package edu.fiuba.algo3.modeloGrafico.Contenedores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FondoVentana extends ImageView {


    public FondoVentana(){

        Image imagen = new Image("fondo.jpg");
        ImageView imageView = new ImageView(imagen);
        imageView.setFitHeight(700);
        imageView.setFitWidth(800);

    }

}
