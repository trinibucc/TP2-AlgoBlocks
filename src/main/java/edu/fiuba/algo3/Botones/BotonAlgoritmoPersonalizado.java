package edu.fiuba.algo3.Botones;


import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class BotonAlgoritmoPersonalizado extends ChoiceBox {

    public BotonAlgoritmoPersonalizado(TextField nombre){
        this.setId("Personalizados");
        this.getItems().add(nombre.getText());
    }
}
