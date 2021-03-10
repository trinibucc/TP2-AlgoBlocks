package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.BloqueRepetir;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonRepetirTresVecesEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private ContenedorAlgoritmo contenedorAlgoritmo;


    public BotonRepetirTresVecesEventHandler(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo){
        this.algoBlocks = algoBlocks;
        this.contenedorAlgoritmo  = contenedorAlgoritmo;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueRepetir repetir = algoBlocks.agregarBloqueRepetirTresVeces();
        repetir.agregarBloque(algoBlocks);
        ImageView imageView = new ImageView(new Image("repetir3.png", 50, 50, true, true));
        contenedorAlgoritmo.agregarImagen(imageView);

    }
}
