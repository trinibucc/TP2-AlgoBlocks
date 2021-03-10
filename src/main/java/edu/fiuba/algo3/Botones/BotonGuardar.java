package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonGuardarEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BotonGuardar extends Button {

    private EventHandler evento;

    public BotonGuardar(AlgoBlocks algoBlocks, TextField nombreIngresado, Label label,
                        ContenedorAlgoritmo contenedorAlgoritmo, BotoneraMovimientos botoneraMovimientos){

        this.setText("Guardar");
        this.setPrefSize(100, 30);
        this.evento = new BotonGuardarEventHandler(algoBlocks, nombreIngresado, label,
                contenedorAlgoritmo, botoneraMovimientos);
        this.setOnAction(evento);
        this.setLineSpacing(5);
        this.setTextFill(Color.DARKCYAN);
        this.setFont(new Font("candara", 16));
    }

    public EventHandler obtenerEvento(){

        return evento;

    }
}
