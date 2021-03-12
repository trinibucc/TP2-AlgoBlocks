package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Observable {

   private ArrayList<Observer> observadores;

    public Observable() {

        this.observadores = new ArrayList<>();
    }

    public void addObserver(Observer observer) {

        this.observadores.add(observer);
    }

    public void notifyObservers() {

        this.observadores.stream().forEach(observer -> observer.update());
    }

}
