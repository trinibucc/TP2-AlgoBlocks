package edu.fiuba.algo3.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Vista.Contenedores.ContenedorGuardar;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class BotoneraMovimientos extends VBox {

    public BotoneraMovimientos(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo){

        ContenedorGuardar contenedorGuardar = new ContenedorGuardar(algoBlocks, contenedorAlgoritmo, this);

        BotonDerecha botonDerecha = new BotonDerecha(algoBlocks, contenedorAlgoritmo);
        BotonIzquierda botonIzquierda = new BotonIzquierda(algoBlocks, contenedorAlgoritmo);
        BotonArriba botonArriba = new BotonArriba(algoBlocks, contenedorAlgoritmo);
        BotonAbajo botonAbajo = new BotonAbajo(algoBlocks, contenedorAlgoritmo);
        BotonRepetirDosVeces repetirDosVeces = new BotonRepetirDosVeces(algoBlocks, contenedorAlgoritmo);
        BotonRepetirTresVeces repetirTresVeces = new BotonRepetirTresVeces(algoBlocks, contenedorAlgoritmo);
        BotonInvertir invertir = new BotonInvertir(algoBlocks, contenedorAlgoritmo);
        BotonBajarLapiz bajarLapiz = new BotonBajarLapiz(algoBlocks, contenedorAlgoritmo);
        BotonSubirLapiz subirLapiz = new BotonSubirLapiz(algoBlocks, contenedorAlgoritmo);


        this.getChildren().addAll(contenedorGuardar, botonDerecha, botonIzquierda, botonArriba, botonAbajo,
                repetirDosVeces, repetirTresVeces, invertir, bajarLapiz, subirLapiz);
        this.setPadding(new Insets(20));
        this.setSpacing(10);

    }


    public void agregarBoton(BotonAlgoritmoPersonalizado personalizado) {

        this.getChildren().add(personalizado);
    }
}
