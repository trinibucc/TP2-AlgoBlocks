package edu.fiuba.algo3.Vista.Contenedores;


import edu.fiuba.algo3.Controladores.SalirEventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class BarraMenu extends MenuBar {

    public BarraMenu(){

        Menu archivo = new Menu("Archivo");
        MenuItem salir = new MenuItem("Salir");

        SalirEventHandler salirEventHandler = new SalirEventHandler();
        salir.setOnAction(salirEventHandler);

        archivo.getItems().addAll(salir);

        this.getMenus().add(archivo);
    }
}
