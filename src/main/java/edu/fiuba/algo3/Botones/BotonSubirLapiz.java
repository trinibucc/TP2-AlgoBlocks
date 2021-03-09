package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonSubirLapizEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonSubirLapiz extends Button {

    public BotonSubirLapiz(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo) {

        this.setText("Subir lapiz");
        this.setEffect(new InnerShadow());
        this.setOnAction(new BotonSubirLapizEventHandler(algoBlocks, contenedorAlgoritmo));
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }
}
