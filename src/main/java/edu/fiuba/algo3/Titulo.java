package edu.fiuba.algo3;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Titulo {

    public Label crearTitulo(){
        Label titulo = new Label();
        titulo.setText("ALGOBLOCKS");
        titulo.setPadding(new Insets(10));
        titulo.setBackground(new Background(new BackgroundFill(Color.web("#C0C0C0"), CornerRadii.EMPTY, Insets.EMPTY)));
        titulo.setTextFill(Color.web("#FFFFFF"));
        Font auxFont = titulo.getFont();
        titulo.setFont(new Font(auxFont.getStyle(), 20));
        return titulo;
    }


}


