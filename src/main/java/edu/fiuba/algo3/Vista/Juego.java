package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Vista.Contenedores.BarraMenu;
import edu.fiuba.algo3.Vista.Contenedores.FondoVentana;
import edu.fiuba.algo3.Vista.Contenedores.InicializadorModelo;
import edu.fiuba.algo3.Vista.Contenedores.Titulo;
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
