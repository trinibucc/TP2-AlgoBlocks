package edu.fiuba.algo3.Controladores;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.BloqueRepetir;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class BotonRepetirDosVecesEventHandler implements EventHandler<ActionEvent> {

    private AlgoBlocks algoBlocks;
    private ContenedorAlgoritmo contenedorAlgoritmo;


    public BotonRepetirDosVecesEventHandler(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo){
        this.algoBlocks = algoBlocks;
        this.contenedorAlgoritmo = contenedorAlgoritmo;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueRepetir repetir = algoBlocks.agregarBloqueRepetirDosVeces();
        repetir.agregarBloque(algoBlocks);
        ImageView imageView = new ImageView(new Image("repetir2.png", 50, 65, true, true));
        contenedorAlgoritmo.agregarImagen(imageView);

    }
}
