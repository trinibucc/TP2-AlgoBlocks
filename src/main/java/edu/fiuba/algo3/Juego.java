package edu.fiuba.algo3;

import edu.fiuba.algo3.modeloGrafico.Contenedores.InicializadorModelo;
import edu.fiuba.algo3.modeloGrafico.Contenedores.Titulo;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;


public class Juego {

    public Juego(){
    }

    public GridPane crearVentanPrincipal(){
//
        //FondoVentana fondo = new FondoVentana();
        Background fondo = new Background( new BackgroundImage(new Image("fondo.jpg"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(800, 700, false, false, false, false)));
        VBox componentes = crearVentana();
        GridPane todo = new GridPane();

        todo.setBackground(fondo);
        todo.getChildren().add(componentes);
        return todo;
    }

    public VBox crearVentana(){

        Titulo titulo = new Titulo();

        VBox central = crearContenedorCentral();
        VBox ventana = new VBox(titulo, central);
        ventana.setSpacing(10);
        ventana.setPadding(new Insets(20));
        return ventana;
    }

    public VBox crearContenedorCentral(){

        InicializadorModelo inicializadorModelo = new InicializadorModelo();
        VBox central = inicializadorModelo.creadorContenedorVertical();
        return central;

    }
}
