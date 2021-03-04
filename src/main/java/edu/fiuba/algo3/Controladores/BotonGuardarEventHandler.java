package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class BotonGuardarEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private TextField nombre;
    private Label label;

    public BotonGuardarEventHandler(AlgoBlocks algoBlocks, TextField nombreIngresado, Label label){

        this.algoBlocks = algoBlocks;
        this.nombre = nombreIngresado;
        this.label = label;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (this.nombre.getText().trim().equals("")) {

            this.label.setText("Debe ingresar un texto");
            this.label.setTextFill(Color.web("#FF0000"));

        } else {
            this.label.setTextFill(Color.web("#336600"));
            algoBlocks.guardarAlgoritmo(nombre.getText());
        }

    }
}
