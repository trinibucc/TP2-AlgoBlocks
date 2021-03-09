package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonDerechaEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private ContenedorAlgoritmo contenedorAlgoritmo;


    public BotonDerechaEventHandler(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo){
        this.algoBlocks = algoBlocks;
        this.contenedorAlgoritmo = contenedorAlgoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoBlocks.agregarBloqueDerecha();
        ImageView imageView = new ImageView(new Image("flecha.png", 50, 50, true, true));
        contenedorAlgoritmo.agregarImagen(imageView);
    }
}
