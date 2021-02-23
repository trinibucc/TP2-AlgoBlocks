package edu.fiuba.algo3.modelo;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloqueTest {

    @Test
    public void test01BloqueDerechaSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(1, 0);
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Personaje personaje = new Personaje();
        bloqueDerecha.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test02BloqueIzquierdaSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(-1, 0);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        Personaje personaje = new Personaje();
        bloqueIzquierda.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test03BloqueArribaSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(0, 1);
        BloqueArriba bloqueArriba = new BloqueArriba();
        Personaje personaje = new Personaje();
        bloqueArriba.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test04BloqueAbajoSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(0, -1);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Personaje personaje = new Personaje();
        bloqueAbajo.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test05LapizAbajoCambiaElLapizDelPersonaje(){
        LapizAbajo lapizAbajo = new LapizAbajo();
        Personaje personaje = new Personaje();
        lapizAbajo.ejecutar(personaje);
        assertTrue(personaje.obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void test06LapizArribaCambiaElLapizDelPersonaje(){
        LapizArriba lapizArriba = new LapizArriba();
        Personaje personaje = new Personaje();
        lapizArriba.ejecutar(personaje);
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test07BloqueRepetirRepiteDosVecesYmueveAlPersonaje(){
        Personaje personaje = new Personaje();
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        bloqueRepetir.agregarBloque(algoBlocks);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueArriba();
        bloqueRepetir.ejecutar(personaje);
        Posicion posicion = new Posicion(-2,2);

        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test08BloqueRepetirRepiteTresVecesYmueveAlPersonaje(){
        Personaje personaje = new Personaje();
        BloqueRepetir bloqueRepetir = new BloqueRepetir(3);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        bloqueRepetir.agregarBloque(algoBlocks);
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        bloqueRepetir.ejecutar(personaje);
        Posicion posicion = new Posicion(-6,0);

        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test09BloqueInversoInvierteAlgoritmo(){
        Personaje personaje = new Personaje();
        BloqueInverso bloqueInverso = new BloqueInverso();
        AlgoBlocks algoBlocks = new AlgoBlocks();
        bloqueInverso.agregarBloque(algoBlocks);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueDerecha();
        bloqueInverso.ejecutar(personaje);
        List<Bloque> listaInvertida = new ArrayList<>();
        listaInvertida.add(new BloqueDerecha().opuesto());
        listaInvertida.add(new BloqueArriba().opuesto());
        boolean sonDiferentes = false;
        if(listaInvertida.size() != bloqueInverso.obtenerLista().size())
            sonDiferentes = true;
        else {
            for(int i = 0; i < listaInvertida.size(); i++){
                if((listaInvertida.get(i)).getClass() != (bloqueInverso.obtenerLista().get(i)).getClass())
                    sonDiferentes = true;
            }
        }
        assertFalse(sonDiferentes);
    }

    @Test
    public void test10BloqueRepetirTieneSuPropioAlogoBlocksQueAñadeAListaDeBloqueRepetir(){
        Personaje personaje = new Personaje();
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2);
        AlgoBlocks algoBlocks = new AlgoBlocks();
        bloqueRepetir.agregarBloque(algoBlocks);
        algoBlocks.agregarBloqueDerecha();
        List<Bloque> listaBloqueRepeitr = new ArrayList<>();
        listaBloqueRepeitr.add(new BloqueDerecha());
        boolean sonDiferentes = false;
        if(listaBloqueRepeitr.size() != bloqueRepetir.obtenerLista().size())
            sonDiferentes = true;
        else {
            for(int i = 0; i < listaBloqueRepeitr.size(); i++){
                if((listaBloqueRepeitr.get(i)).getClass() != (bloqueRepetir.obtenerLista().get(i)).getClass())
                    sonDiferentes = true;
            }
        }
        assertFalse(sonDiferentes);
    }


    @Test
    public void test11BloqueAlgoritmoPersonalizado() {
        Personaje personaje = new Personaje();
        List<Bloque> bloques = new ArrayList<>();
        bloques.add(new BloqueArriba());
        bloques.add(new BloqueIzquierda());
        BloquePersonalizado personalizado = new BloquePersonalizado(bloques);
        personalizado.ejecutar(personaje);
        Posicion posicion = new Posicion(-1,1);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }
}