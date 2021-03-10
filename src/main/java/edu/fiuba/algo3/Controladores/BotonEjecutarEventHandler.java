package edu.fiuba.algo3.Controladores;


import edu.fiuba.algo3.Vista.Dibujador;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;


public class BotonEjecutarEventHandler implements EventHandler<ActionEvent> {

    private Algoritmo algoritmo;
    private Dibujador dibujadorConTrazo;

    public BotonEjecutarEventHandler(Algoritmo algoritmo, Dibujador dibujadorConTrazo) {
        this.algoritmo = algoritmo;
        this.dibujadorConTrazo  = dibujadorConTrazo;
    }

    @Override
    public void handle(ActionEvent Event) {
        try {
            algoritmo.ejecutar();
            dibujadorConTrazo.actualizar();
            //  algoritmo.reiniciar();
        }catch(Exception CantidadInsuficienteDeBloquesError){
            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("AlgoBlocks");
            dialogoInfo.setHeaderText("Cantidad insuficiente de bloques");
            dialogoInfo.setContentText("No hay bloques para ejecutar");
            dialogoInfo.showAndWait();
        }
    }

}
