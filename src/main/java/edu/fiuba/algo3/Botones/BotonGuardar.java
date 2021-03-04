package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonGuardarEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BotonGuardar extends Button {

    public BotonGuardar(AlgoBlocks algoBlocks, TextField nombreIngresado, Label label){

        this.setText("Guardar");
        this.setOnAction(new BotonGuardarEventHandler(algoBlocks, nombreIngresado, label));
    }
}
