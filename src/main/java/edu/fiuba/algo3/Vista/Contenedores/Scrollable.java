package edu.fiuba.algo3.Vista.Contenedores;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;

public class Scrollable extends ScrollPane {

    public Scrollable(Node nodo){

       // this.setStyle("-fx-background-color: white");
        //this.setHeight(50);
       // this.setWidth(50);
        this.setContent(nodo);
    }

}
