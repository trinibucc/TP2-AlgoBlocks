package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Controladores.IngresarNombreEventHandler;
import javafx.scene.control.TextField;

public class IngresarNombre extends TextField {

    public IngresarNombre(BotonGuardar guardar) {

        this.setPromptText("Ingrese un nombre");
        this.setOnKeyPressed(new IngresarNombreEventHandler(guardar));

    }
}
