package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.vista.botones.BotonAlgoritmoPersonalizado;
import edu.fiuba.algo3.vista.botones.BotoneraMovimientos;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class BotonGuardarEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private TextField nombre;
    private Label label;
    private BotoneraMovimientos botonera;

    public BotonGuardarEventHandler(AlgoBlocks algoBlocks, TextField nombreIngresado, Label label, BotoneraMovimientos botonera){

        this.algoBlocks = algoBlocks;
        this.nombre = nombreIngresado;
        this.label = label;
        this.botonera = botonera;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (this.nombre.getText().trim().equals("")) {
            this.label.setText("Debe ingresar un texto");
            this.label.setTextFill(Color.web("#FF0000"));

        } else {
            this.label.setText("");
            try {
                algoBlocks.guardarAlgoritmo(nombre.getText());
                BotonAlgoritmoPersonalizado personalizado = new BotonAlgoritmoPersonalizado(algoBlocks, nombre.getText());
                botonera.agregarBoton(personalizado);
                nombre.setText("");
                nombre.requestFocus();
            }catch (Exception CantidadInsuficienteDeBloquesError){
                Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
                dialogoInfo.setTitle("AlgoBlocks");
                dialogoInfo.setHeaderText("Cantidad insuficiente de bloques");
                dialogoInfo.setContentText("No hay bloques para guardar");
                dialogoInfo.showAndWait();
            }
        }

    }
}
