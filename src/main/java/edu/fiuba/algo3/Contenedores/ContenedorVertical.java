package edu.fiuba.algo3.Contenedores;

import edu.fiuba.algo3.Botones.BotonEjecutar;
import edu.fiuba.algo3.Vista.CreadorSectorTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorVertical extends VBox {

    public ContenedorVertical(AlgoBlocks algoBlocks, Algoritmo algoritmo){

        ContenedorCentral central = new ContenedorCentral(algoBlocks, algoritmo);
        CreadorSectorTablero sectorTablero = central.obtenerSectorTablero();


        BotonEjecutar ejecutar = new BotonEjecutar(algoritmo,
                sectorTablero.obtenerDibujador());

        ContenedorAlgoritmo contenedorAlgoritmo = new ContenedorAlgoritmo();
        HBox hbox = new HBox(50, ejecutar, contenedorAlgoritmo);

        this.getChildren().addAll(central, hbox);
        this.setSpacing(20);


    }
}
