package edu.fiuba.algo3.Vista.Contenedores;

import edu.fiuba.algo3.Vista.Botones.BotonGuardar;
import edu.fiuba.algo3.Vista.Botones.BotoneraMovimientos;
import edu.fiuba.algo3.Vista.Botones.IngresarNombre;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorGuardar extends HBox {

    private IngresarNombre nombreIngresado;
    private AlgoBlocks algoBlocks;
    private Label label;
    private BotonGuardar guardar;

    public ContenedorGuardar(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo, BotoneraMovimientos botonera){

        this.nombreIngresado = new IngresarNombre(guardar);
        VBox contenedorLabel = new VBox();
        this.label = new Label();
        contenedorLabel.getChildren().addAll(nombreIngresado, label);
        this.algoBlocks = algoBlocks;
        this.guardar = new BotonGuardar(algoBlocks, nombreIngresado, label, contenedorAlgoritmo, botonera);
        this.getChildren().addAll(guardar, contenedorLabel);
        this.setSpacing(20);

    }

}
