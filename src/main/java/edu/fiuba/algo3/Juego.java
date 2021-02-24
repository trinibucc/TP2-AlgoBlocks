package edu.fiuba.algo3;

import edu.fiuba.algo3.modeloGrafico.Contenedores.FondoVentana;
import edu.fiuba.algo3.modeloGrafico.Contenedores.InicializadorModelo;
import edu.fiuba.algo3.modeloGrafico.Contenedores.Titulo;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Juego {

    public Juego(){
    }

    public StackPane crearVentanPrincipal(){

        FondoVentana fondo = new FondoVentana();
        VBox componentes = crearVentana();
        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(fondo);
        stackPane.getChildren().add(componentes);
        return stackPane;
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
