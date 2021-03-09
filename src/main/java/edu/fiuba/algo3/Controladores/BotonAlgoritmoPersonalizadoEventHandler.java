package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonAlgoritmoPersonalizadoEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private String nombre;
    private ContenedorAlgoritmo contenedorAlgoritmo;

    public BotonAlgoritmoPersonalizadoEventHandler(AlgoBlocks algoBlocks, String nombre, ContenedorAlgoritmo algoritmo) {

        this.algoBlocks = algoBlocks;
        this.nombre = nombre;
        this.contenedorAlgoritmo = algoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        algoBlocks.agregarAlgoritmoPersonalizado(nombre);
        contenedorAlgoritmo.agregarImagen(new ImageView(new Image("personalizado.png", 50, 50, true, true)));


    }
}
