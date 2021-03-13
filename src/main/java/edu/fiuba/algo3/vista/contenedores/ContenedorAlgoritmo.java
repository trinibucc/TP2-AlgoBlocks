package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;


public class ContenedorAlgoritmo extends GridPane {

    static final int TAMANIO_ALGORITMO = 20;
    static final int TAMANIO_IMAGEN = 50;



    public ContenedorAlgoritmo(){
        this.establecerContenedor();
    }

    private void establecerContenedor(){

        for(int i = 0; i < this.TAMANIO_ALGORITMO; i++){
            this.add(new ImageView(new Image("cuadrado-blanco.png", TAMANIO_IMAGEN, TAMANIO_IMAGEN, true, true)), i, 0);
        }

    }




}
