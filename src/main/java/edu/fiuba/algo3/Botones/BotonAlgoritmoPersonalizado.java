package edu.fiuba.algo3.Botones;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonAlgoritmoPersonalizado extends ComboBox {


    public BotonAlgoritmoPersonalizado(TextField nombre) {

        this.setPromptText("Personalizados");
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll(nombre.getText());
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.getEditor().setFont(new Font("helvetica", 16));
    }
}
