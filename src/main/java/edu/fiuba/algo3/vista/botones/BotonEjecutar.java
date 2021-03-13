package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controladores.BotonEjecutarEventHandler;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class BotonEjecutar extends Button {

    public BotonEjecutar(Algoritmo algoritmo, edu.fiuba.algo3.vista.VistaTablero vistaTablero){

        this.setText("EJECUTAR");
        this.setOnAction(new BotonEjecutarEventHandler(algoritmo, vistaTablero));
        this.setLineSpacing(10);
        this.setPadding(new Insets(15));
        this.setFont(new Font("candara", 20));
        this.setHeight(100);
        this.setWidth(100);

    }
}
