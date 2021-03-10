package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonBajarLapizEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;


public class BotonBajarLapiz extends Button {

    public BotonBajarLapiz(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo) {
        this.setText("Bajar lapiz");
        this.setPrefSize(100, 30);
        this.setOnAction(new BotonBajarLapizEventHandler(algoBlocks, contenedorAlgoritmo));
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
    }
}
