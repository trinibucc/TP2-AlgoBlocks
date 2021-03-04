package edu.fiuba.algo3.Controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SalirEventHandler implements EventHandler<ActionEvent> {


    @Override
    public void handle(ActionEvent actionEvent) {
        System.exit(0);
    }


}
