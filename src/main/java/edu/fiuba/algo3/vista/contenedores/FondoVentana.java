package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class FondoVentana extends ImageView {

    Background fondo;

    public Background crearFondo(){
        this.fondo = new Background(new BackgroundImage(new Image("fondo.png"),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT));
        return fondo;
    }


}
