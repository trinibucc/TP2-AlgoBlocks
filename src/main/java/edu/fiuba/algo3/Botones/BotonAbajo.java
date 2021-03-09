package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonAbajoEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;


public class BotonAbajo extends Button {



    public BotonAbajo(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo) {

        this.setText("Abajo");
        this.setEffect(new InnerShadow());
        this.setOnAction(new BotonAbajoEventHandler(algoBlocks, contenedorAlgoritmo));
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));

    }

}
