package edu.fiuba.algo3.Vista.Contenedores;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;


public class ContenedorAlgoritmo extends GridPane {

    private final int tamñoAlgoritmo = 20;
    private int posicion = 0;


    public ContenedorAlgoritmo(){
        this.establecerContenedor();
    }

    private void establecerContenedor(){

        for(int i = 0; i < this.tamñoAlgoritmo; i++){
            this.add(new ImageView(new Image("cuadrado-blanco.png", 50, 50, true, true)), i, 0);
        }

    }

    public void agregarImagen(ImageView imagen){
        this.add(imagen, posicion, 0);
        posicion++;
    }
}
