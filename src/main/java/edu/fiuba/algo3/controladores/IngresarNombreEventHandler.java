package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.vista.botones.BotonGuardar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class IngresarNombreEventHandler implements EventHandler<KeyEvent> {

    private BotonGuardar guardar;

    public IngresarNombreEventHandler(BotonGuardar guardar) {
        this.guardar = guardar;
    }


    @Override
    public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            event.fireEvent(guardar, new ActionEvent());
        }

    }

}
