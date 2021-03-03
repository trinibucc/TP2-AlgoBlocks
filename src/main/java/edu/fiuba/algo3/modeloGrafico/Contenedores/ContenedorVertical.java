package edu.fiuba.algo3.modeloGrafico.Contenedores;

import edu.fiuba.algo3.Botones.BotonEjecutar;
import edu.fiuba.algo3.Vista.CreadorSectorTablero;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.layout.VBox;

public class ContenedorVertical extends VBox {

    public ContenedorVertical(AlgoBlocks algoBlocks, Algoritmo algoritmo){

        ContenedorCentral central = new ContenedorCentral(algoBlocks, algoritmo);
        CreadorSectorTablero sectorTablero = central.obtenerSectorTablero();

        BotonEjecutar ejecutar = new BotonEjecutar(algoritmo,
                sectorTablero.obtenerDibujador());

        this.getChildren().addAll(central, ejecutar);
        this.setSpacing(20);


    }
}
