package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.vista.contenedores.BarraMenu;
import edu.fiuba.algo3.vista.contenedores.FondoVentana;
import edu.fiuba.algo3.vista.contenedores.InicializadorModelo;
import edu.fiuba.algo3.vista.contenedores.Titulo;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Juego {


    public GridPane crearVentanPrincipal(){

        Background fondo = (new FondoVentana()).crearFondo();

        VBox componentes = this.crearVentana();
        GridPane ventanaCompleta = new GridPane();

        ventanaCompleta.setBackground(fondo);
        ventanaCompleta.getChildren().add(componentes);

        return ventanaCompleta;
    }

    public VBox crearVentana(){

        BarraMenu barraMenu = new BarraMenu();
        Titulo titulo = new Titulo();
        VBox central = this.crearContenedorCentral();

        VBox ventana = new VBox(barraMenu, titulo, central);
        ventana.setSpacing(15);
        ventana.setPadding(new Insets(20));

        return ventana;
    }

    public VBox crearContenedorCentral(){

        InicializadorModelo inicializadorModelo = new InicializadorModelo();
        VBox central = inicializadorModelo.creadorContenedorVertical();

        return central;

    }
}
