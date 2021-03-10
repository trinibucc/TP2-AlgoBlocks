package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.BloqueRepetir;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class BotonInvertirEventHandler implements EventHandler<ActionEvent>{

    private AlgoBlocks algoBlocks;
    private ContenedorAlgoritmo contenedorAlgoritmo;


    public BotonInvertirEventHandler(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo){

            this.algoBlocks = algoBlocks;
            this.contenedorAlgoritmo = contenedorAlgoritmo;
    }


    @Override
    public void handle(ActionEvent actionEvent) {

        BloqueRepetir repetir = algoBlocks.agregarBloqueRepetirTresVeces();
        repetir.agregarBloque(algoBlocks);
        ImageView imageView = new ImageView(new Image("invertir.png", 50, 50, true, true));
        contenedorAlgoritmo.agregarImagen(imageView);
    }

}
