package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonRepetirDosVecesEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonRepetirDosVeces extends Button {

    public BotonRepetirDosVeces(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo) {
        this.setText("Repetir X2");
        this.setPrefSize(100, 30);
        this.setEffect(new InnerShadow());
        this.setOnAction(new BotonRepetirDosVecesEventHandler(algoBlocks, contenedorAlgoritmo));
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
