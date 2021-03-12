package edu.fiuba.algo3.Vista.Contenedores;

import edu.fiuba.algo3.Controladores.IngresarNombreEventHandler;
import edu.fiuba.algo3.Vista.Botones.BotonGuardar;
import edu.fiuba.algo3.Vista.Botones.BotoneraMovimientos;
import edu.fiuba.algo3.Vista.Botones.IngresarNombre;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorGuardar extends HBox {


    public ContenedorGuardar(AlgoBlocks algoBlocks, BotoneraMovimientos botonera){

        IngresarNombre nombreIngresado = new IngresarNombre();

        VBox vb = new VBox();
        Label label = new Label();

        vb.getChildren().addAll(nombreIngresado, label);

        BotonGuardar guardar = new BotonGuardar(algoBlocks, nombreIngresado, label, botonera);
        nombreIngresado.setOnKeyPressed(new IngresarNombreEventHandler(guardar));

        this.getChildren().addAll(guardar, vb);
        this.setSpacing(20);

    }

}
