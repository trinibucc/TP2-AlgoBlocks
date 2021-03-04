package edu.fiuba.algo3.Contenedores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class ContenedorAlgoritmo extends GridPane {

    private final int tamñoAlgoritmo = 20;

    public ContenedorAlgoritmo(){
        this.establecerContenedor();
    }

    private void establecerContenedor(){
        Image imagen = new Image("cuadrado-blanco.png", 50, 50, true, true);
        for(int i = 0; i < this.tamñoAlgoritmo; i++){
            this.add(new ImageView(imagen), i, 0);
        }
        this.setGridLinesVisible(true);
    }
}
