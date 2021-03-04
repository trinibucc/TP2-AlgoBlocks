package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Botones.BotonGuardar;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class IngresarNombreEventHandler implements EventHandler<KeyEvent> {

    private BotonGuardar guardar;

    public IngresarNombreEventHandler(BotonGuardar guardar) {

        this.guardar = guardar;
    }


    @Override
    public void handle(KeyEvent keyEvent) {

        if (keyEvent.getCode() == KeyCode.ENTER) {
            Event.fireEvent(guardar, new ActionEvent());
        }
    }

}
