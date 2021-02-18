package edu.fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AlgoBlocks {


    private List<Bloque> algoritmo;
    Map<String, BloquePersonalizado> bloquesPersonalizado = new HashMap<>();

    public AlgoBlocks(){

    }
    public void agregarLista(List<Bloque> algoritmo){
        this.algoritmo = algoritmo;
    }


    public void agregarLapizArriba() {
        LapizArriba lapizArriba = new LapizArriba();
        this.algoritmo.add(lapizArriba);
    }


    public void agregarLapizAbajo() {
        LapizAbajo lapizAbajo = new LapizAbajo();
        this.algoritmo.add(lapizAbajo);
    }

    public void agregarBloqueDerecha() {
        Bloque bloqueDerecha = new BloqueDerecha();
        this.algoritmo.add(bloqueDerecha);
    }

    public void agregarBloqueAbajo() {
        Bloque bloqueAbajo = new BloqueAbajo();
        this.algoritmo.add(bloqueAbajo);
    }

    public void agregarBloqueIzquierda() {
        Bloque bloqueIzquierda = new BloqueIzquierda();
        this.algoritmo.add(bloqueIzquierda);
    }

    public void agregarBloqueArriba() {
        Bloque bloqueArriba = new BloqueArriba();
        this.algoritmo.add(bloqueArriba);
    }

    public BloqueRepetir agregarBloqueRepetirDosVeces(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2);
        this.algoritmo.add(bloqueRepetir);
        return bloqueRepetir;
    }

    public BloqueRepetir agregarBloqueRepetirTresVeces(){
        BloqueRepetir bloqueRepetir = new BloqueRepetir(3);
        this.algoritmo.add(bloqueRepetir);
        return bloqueRepetir;
    }

    public BloqueInverso agregarBloqueInverso(){
        BloqueInverso bloqueInverso = new BloqueInverso();
        this.algoritmo.add(bloqueInverso);
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
    }

    public void reiniciar() {
        algoritmo.clear();
    }
}