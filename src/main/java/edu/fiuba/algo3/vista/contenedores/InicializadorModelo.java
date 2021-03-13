package edu.fiuba.algo3.vista.contenedores;


import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.scene.layout.VBox;


public class InicializadorModelo {

    Personaje personaje;
    Algoritmo algoritmo;
    AlgoBlocks algoBlocks;

    public InicializadorModelo(){

        this.personaje = new Personaje();

        this.algoritmo = new Algoritmo(personaje);

        this.algoBlocks = new AlgoBlocks();
        algoritmo.agregarLista(algoBlocks);
    }

    public VBox creadorContenedorVertical(){

        VBox contenedorVertical = new ContenedorVertical(algoBlocks, algoritmo);

        return contenedorVertical;
    }
}
