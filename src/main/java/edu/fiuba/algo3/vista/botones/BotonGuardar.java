package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonGuardarEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BotonGuardar extends Button {

    private EventHandler evento;

    public BotonGuardar(AlgoBlocks algoBlocks, TextField nombreIngresado, Label label, BotoneraMovimientos botoneraMovimientos){

        this.setText("Guardar");
        this.setPrefSize(100, 30);
        this.evento = new BotonGuardarEventHandler(algoBlocks, nombreIngresado, label, botoneraMovimientos);
        this.setOnAction(evento);
        this.setLineSpacing(5);
        this.setTextFill(Color.DARKCYAN);
        this.setFont(new Font("candara", 16));
    }

    public EventHandler obtenerEvento(){

        return evento;

    }
}
