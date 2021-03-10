package edu.fiuba.algo3.Vista.Contenedores;

import edu.fiuba.algo3.Botones.BotonEjecutar;
import edu.fiuba.algo3.Vista.CreadorSectorTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorVertical extends VBox {

    public ContenedorVertical(AlgoBlocks algoBlocks, Algoritmo algoritmo){


        ContenedorAlgoritmo contenedorAlgoritmo = new ContenedorAlgoritmo();

        Scrollable scrollable = new Scrollable(contenedorAlgoritmo);
        scrollable.setMaxSize(1000, 70);
        scrollable.setMinSize(1000, 70);

        ContenedorCentral central = new ContenedorCentral(algoBlocks, algoritmo, contenedorAlgoritmo);
        CreadorSectorTablero sectorTablero = central.obtenerSectorTablero();

        BotonEjecutar ejecutar = new BotonEjecutar(algoritmo,
                sectorTablero.obtenerDibujador());

        HBox hbox = new HBox(ejecutar, scrollable);
        hbox.setSpacing(20);

        this.getChildren().addAll(central, hbox);
        this.setSpacing(15);


    }
}
