package edu.fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AlgoBlocks extends Observable{

    private List<Bloque> algoritmo;
    Map<String, BloquePersonalizado> bloquesPersonalizado = new HashMap<>();

    public void agregarLista(List<Bloque> algoritmo){
        this.algoritmo = algoritmo;
    }


    public void agregarLapizArriba() {
        LapizArriba lapizArriba = new LapizArriba();
        this.algoritmo.add(lapizArriba);
        this.notifyObservers();
    }


    public void agregarLapizAbajo() {
        LapizAbajo lapizAbajo = new LapizAbajo();
        this.algoritmo.add(lapizAbajo);
        this.notifyObservers();
    }

    public void agregarBloqueDerecha() {
        Bloque bloqueDerecha = new BloqueDerecha();
        this.algoritmo.add(bloqueDerecha);
        this.notifyObservers();
    }

    public void agregarBloqueAbajo() {
        Bloque bloqueAbajo = new BloqueAbajo();
        this.algoritmo.add(bloqueAbajo);
        this.notifyObservers();
    }

    public void agregarBloqueIzquierda() {
        Bloque bloqueIzquierda = new BloqueIzquierda();
        this.algoritmo.add(bloqueIzquierda);
        this.notifyObservers();
    }

    public void agregarBloqueArriba() {
        Bloque bloqueArriba = new BloqueArriba();
        this.algoritmo.add(bloqueArriba);
        this.notifyObservers();
    }

    public BloqueRepetir agregarBloqueRepetirDosVeces(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2, "repetir2");
        this.algoritmo.add(bloqueRepetir);
        this.notifyObservers();
        return bloqueRepetir;
    }

    public BloqueRepetir agregarBloqueRepetirTresVeces(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(3, "repetir3");
        this.algoritmo.add(bloqueRepetir);
        this.notifyObservers();
        return bloqueRepetir;
    }

    public BloqueInverso agregarBloqueInverso(){
        BloqueInverso bloqueInverso = new BloqueInverso();
        this.algoritmo.add(bloqueInverso);
        this.notifyObservers();
        return bloqueInverso;
    }

    public void guardarAlgoritmo(String nombre) {
        if(this.algoritmo.size() < 1){
            throw new CantidadInsuficienteDeBloquesError();
        }
        if(this.bloquesPersonalizado.containsKey(nombre)){
            throw new NombreInvalidoError();
        }
        BloquePersonalizado bloquePersonalizado = new BloquePersonalizado(algoritmo);
        bloquesPersonalizado.put(nombre, bloquePersonalizado);
    }

    public void agregarAlgoritmoPersonalizado(String nombre){
        BloquePersonalizado bloquePersonalizado = bloquesPersonalizado.get(nombre);
        algoritmo.add(bloquePersonalizado);
        this.notifyObservers();
    }

    public void reiniciar() {

        SectorDibujo.obtenerSectorDibujo().resetear();
        this.notifyObservers();
    }

}