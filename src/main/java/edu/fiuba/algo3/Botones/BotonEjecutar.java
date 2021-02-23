package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controlador.Ejecutar;
import edu.fiuba.algo3.Vista.Dibujador;
import edu.fiuba.algo3.Vista.Tablero;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class BotonEjecutar extends Button {

    public BotonEjecutar(Algoritmo algoritmo, Tablero tablero, Dibujador dibujador){
        this.setText("EJECUTAR");
        this.setOnAction(new Ejecutar(algoritmo, tablero, dibujador));
        this.setLineSpacing(10);
        this.setPadding(new Insets(15));
    }
}
