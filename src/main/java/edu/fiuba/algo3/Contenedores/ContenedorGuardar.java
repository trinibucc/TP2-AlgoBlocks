package edu.fiuba.algo3.Contenedores;

import edu.fiuba.algo3.Botones.BotonGuardar;
import edu.fiuba.algo3.Botones.IngresarNombre;
import edu.fiuba.algo3.Controladores.IngresarNombreEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ContenedorGuardar extends HBox {

    private IngresarNombre nombreIngresado;
    private AlgoBlocks algoBlocks;
    private Label label;
    private BotonGuardar guardar;

    public ContenedorGuardar(AlgoBlocks algoBlocks){

        this.nombreIngresado = new IngresarNombre();
        this.label = new Label();
        this.algoBlocks = algoBlocks;
        this.guardar = new BotonGuardar(algoBlocks, nombreIngresado, label);
        this.getChildren().add(guardar);
    }

    public IngresarNombre crearIngresarNombre(){

        this.nombreIngresado.setOnKeyPressed(new IngresarNombreEventHandler(guardar));
        this.setSpacing(10);
        this.setPadding(new Insets(20));
        this.getChildren().add(nombreIngresado);

        return nombreIngresado;
    }
}
