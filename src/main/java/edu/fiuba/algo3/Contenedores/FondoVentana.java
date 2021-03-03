package edu.fiuba.algo3.Contenedores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class FondoVentana extends ImageView {

    Background fondo;
    public FondoVentana(){

    }

    public Background crearFondo(){
        this.fondo = new Background( new BackgroundImage(new Image("fondo.jpg"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(800, 700, false, false, false, false)));
        return fondo;
    }



}
