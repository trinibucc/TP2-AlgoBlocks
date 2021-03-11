package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonArribaEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonArriba extends Button {

    public BotonArriba(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo) {

        this.setText("Arriba");
        this.setPrefSize(100, 30);
        this.setOnAction(new BotonArribaEventHandler(algoBlocks, contenedorAlgoritmo));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
