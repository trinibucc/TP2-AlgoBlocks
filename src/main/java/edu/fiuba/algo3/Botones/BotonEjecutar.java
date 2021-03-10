package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.BotonEjecutarEventHandler;
import edu.fiuba.algo3.Vista.Dibujador;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class BotonEjecutar extends Button {

    public BotonEjecutar(Algoritmo algoritmo, Dibujador dibujador){

        this.setText("EJECUTAR");
        this.setOnAction(new BotonEjecutarEventHandler(algoritmo, dibujador));
        this.setLineSpacing(10);
        this.setPadding(new Insets(15));
        this.setFont(new Font("candara", 20));
        this.setHeight(100);
        this.setWidth(100);

    }
}
