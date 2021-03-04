package edu.fiuba.algo3.Contenedores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ContenedorAlgoritmo extends GridPane {

    public ContenedorAlgoritmo(){
        this.establecerContenedor();
    }

    private void establecerContenedor(){
        Image image = new Image("casillaVacia.jpg", 50, 50, true, true);
        for(int i = 0; i < 10; i++){
            this.add(new Rectangle(50, 50, Color.GRAY), i, 0);
        }
    }
}
