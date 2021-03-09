package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Botones.BotonAlgoritmoPersonalizado;
import edu.fiuba.algo3.Botones.BotoneraMovimientos;
import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
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
    private ContenedorAlgoritmo contenedorAlgoritmo;
    private BotoneraMovimientos botonera;

    public BotonGuardarEventHandler(AlgoBlocks algoBlocks, TextField nombreIngresado, Label label,
                                    ContenedorAlgoritmo contenedorAlgoritmo, BotoneraMovimientos botonera){

        this.algoBlocks = algoBlocks;
        this.nombre = nombreIngresado;
        this.label = label;
        this.contenedorAlgoritmo = contenedorAlgoritmo;
        this.botonera = botonera;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (this.nombre.getText().trim().equals("")) {
            this.label.setText("Debe ingresar un texto");
            this.label.setTextFill(Color.web("#FF0000"));

        } else {
            this.label.setText("");
            algoBlocks.guardarAlgoritmo(nombre.getText());
            BotonAlgoritmoPersonalizado personalizado = new BotonAlgoritmoPersonalizado(algoBlocks, nombre.getText(),
                    contenedorAlgoritmo);
            botonera.agregarBoton(personalizado);
            nombre.setText("");
            nombre.requestFocus();
        }

    }
}
