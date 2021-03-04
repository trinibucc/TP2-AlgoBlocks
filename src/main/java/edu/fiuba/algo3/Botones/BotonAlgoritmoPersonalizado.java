package edu.fiuba.algo3.Botones;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BotonAlgoritmoPersonalizado extends ComboBox {



    public BotonAlgoritmoPersonalizado(TextField nombre){

        this.setPromptText("Personalizados");
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll(nombre.getText());
    }

}
