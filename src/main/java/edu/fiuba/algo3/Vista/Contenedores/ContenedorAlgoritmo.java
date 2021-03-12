package edu.fiuba.algo3.Vista.Contenedores;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;


public class ContenedorAlgoritmo extends GridPane {

    private final int tamñoAlgoritmo = 20;
    static final int TAMANIO_IMAGEN = 50;
    private int posicion = 0;


    public ContenedorAlgoritmo(){
        this.establecerContenedor();
    }

    private void establecerContenedor(){

        for(int i = 0; i < this.tamñoAlgoritmo; i++){
            this.add(new ImageView(new Image("cuadrado-blanco.png", TAMANIO_IMAGEN, TAMANIO_IMAGEN, true, true)), i, 0);
        }

    }

    public void agregarImagen(ImageView imagen){
        this.add(imagen, posicion, 0);
        posicion++;
    }


}
