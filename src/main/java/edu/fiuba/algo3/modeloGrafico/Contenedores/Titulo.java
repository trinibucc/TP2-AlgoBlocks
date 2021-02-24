package edu.fiuba.algo3.modeloGrafico.Contenedores;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Titulo extends Label {

    public Titulo(){
        this.setText("ALGOBLOCKS");
        this.setPadding(new Insets(10));
        this.setBackground(new Background(new BackgroundFill(Color.web("#C0C0C0"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setTextFill(Color.web("#FFFFFF"));
        Font auxFont = this.getFont();
        this.setFont(new Font(auxFont.getStyle(), 20));

    }


}


