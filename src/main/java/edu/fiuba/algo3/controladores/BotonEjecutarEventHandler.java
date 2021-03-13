package edu.fiuba.algo3.controladores;


import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;


public class BotonEjecutarEventHandler implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;
    private VistaTablero vistaTablero;

    public BotonEjecutarEventHandler(Algoritmo algoritmo, VistaTablero vistaTablero) {
        this.algoritmo = algoritmo;
        this.vistaTablero = vistaTablero;
    }

    @Override
    public void handle(ActionEvent Event) {
        try {
            algoritmo.ejecutar();
            vistaTablero.update();
        }catch(Exception CantidadInsuficienteDeBloquesError){
            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("AlgoBlocks");
            dialogoInfo.setHeaderText("Cantidad insuficiente de bloques");
            dialogoInfo.setContentText("No hay bloques para ejecutar");
            dialogoInfo.showAndWait();
        }
    }

}
