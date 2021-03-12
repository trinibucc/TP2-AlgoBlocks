package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controladores.BotonTerminarIterativoEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonTerminarIterativo extends Button {

    public BotonTerminarIterativo(AlgoBlocks algoBlocks, Algoritmo algoritmo){

        this.setText("Terminar");
        this.setPrefSize(100, 30);
        this.setOnAction(new BotonTerminarIterativoEventHandler(algoBlocks, algoritmo));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }
}
