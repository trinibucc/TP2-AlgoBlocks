package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Controladores.BotonAlgoritmoPersonalizadoEventHandler;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.text.Font;

public class BotonAlgoritmoPersonalizado extends Button {

    public BotonAlgoritmoPersonalizado(AlgoBlocks algoBlocks, String nombre, ContenedorAlgoritmo algoritmo){

        this.setText(nombre);
        this.setPrefSize(100, 30);
        this.setEffect(new InnerShadow());
        this.setStyle("-fx-background-color: lightcyan");
        this.setFont(new Font("helvetica", 13));
        this.setOnAction(new BotonAlgoritmoPersonalizadoEventHandler(algoBlocks, nombre, algoritmo));

    }
}
