package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.modelo.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;

public class VistaAlgoritmo implements Observer {

    static final int TAMANIO = 50;

    private AlgoBlocks algoBlocks;
    private ContenedorAlgoritmo contenedorAlgoritmo;
    private Algoritmo algoritmo;
    private List<Bloque> bloques;


    public VistaAlgoritmo(ContenedorAlgoritmo contenedorAlgoritmo, AlgoBlocks algoBlocks, Algoritmo algoritmo){

        this.algoBlocks = algoBlocks;
        this.algoBlocks.addObserver(this);
        this.contenedorAlgoritmo = contenedorAlgoritmo;
        this.algoritmo = algoritmo;

    }

    @Override
    public void update() {

        this.contenedorAlgoritmo.getChildren().clear();

        this.bloques = this.algoritmo.obtenerAlgoritmo();

        for (Bloque bloque : bloques) {
            this.updateContenedorAlgoritmo(bloque);
            if (bloque instanceof BloqueIterativo) {
                bloques = ((BloqueIterativo) bloque).obtenerLista();
                for(Bloque bloqueIterativo : bloques){
                    this.updateContenedorAlgoritmo(bloqueIterativo);
                }
            }
        }

    }

    private void updateContenedorAlgoritmo(Bloque bloque){

        ImageView imageView = new ImageView(new Image(bloque.obtenerNombre() + ".png", TAMANIO, TAMANIO, true, true));
        this.contenedorAlgoritmo.agregarImagen(imageView);
    }


}
