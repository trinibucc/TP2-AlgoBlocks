package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Vista.Contenedores.ContenedorAlgoritmo;
import edu.fiuba.algo3.Vista.Contenedores.ContenedorGuardar;
import edu.fiuba.algo3.modelo.AlgoBlocks;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BotoneraMovimientos extends VBox {

    public BotoneraMovimientos(AlgoBlocks algoBlocks, ContenedorAlgoritmo contenedorAlgoritmo, Algoritmo algoritmo){

        ContenedorGuardar contenedorGuardar = new ContenedorGuardar(algoBlocks, this);

        BotonDerecha botonDerecha = new BotonDerecha(algoBlocks);
        BotonIzquierda botonIzquierda = new BotonIzquierda(algoBlocks);
        BotonArriba botonArriba = new BotonArriba(algoBlocks);
        BotonAbajo botonAbajo = new BotonAbajo(algoBlocks);
        BotonRepetirDosVeces repetirDosVeces = new BotonRepetirDosVeces(algoBlocks);
        BotonRepetirTresVeces repetirTresVeces = new BotonRepetirTresVeces(algoBlocks);
        BotonInvertir invertir = new BotonInvertir(algoBlocks);
        BotonBajarLapiz bajarLapiz = new BotonBajarLapiz(algoBlocks);
        BotonSubirLapiz subirLapiz = new BotonSubirLapiz(algoBlocks);

        BotonTerminarIterativo terminarRepetir2 = new BotonTerminarIterativo(algoBlocks, algoritmo);
        BotonTerminarIterativo terminarRepetir3 = new BotonTerminarIterativo(algoBlocks, algoritmo);
        BotonTerminarIterativo terminarInverso = new BotonTerminarIterativo(algoBlocks, algoritmo);

        HBox repetir2veces = new HBox(repetirDosVeces, terminarRepetir2);
        repetir2veces.setSpacing(10);
        HBox repetir3veces = new HBox(repetirTresVeces, terminarRepetir3);
        repetir3veces.setSpacing(10);
        HBox inverso = new HBox(invertir, terminarInverso);
        inverso.setSpacing(10);

        this.getChildren().addAll(contenedorGuardar, botonDerecha, botonIzquierda, botonArriba, botonAbajo,
                repetir2veces, repetir3veces, inverso, bajarLapiz, subirLapiz);
        this.setPadding(new Insets(20));
        this.setSpacing(10);

    }


    public void agregarBoton(BotonAlgoritmoPersonalizado personalizado) {

        this.getChildren().add(personalizado);
    }
}
