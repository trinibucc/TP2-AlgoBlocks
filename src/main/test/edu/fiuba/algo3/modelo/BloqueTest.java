package edu.fiuba.algo3.modelo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BloqueTest {

    @Test
    public void testBloqueDerechaSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(1, 0);
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Personaje personaje = new Personaje();
        bloqueDerecha.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void testBloqueIzquierdaSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(-1, 0);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        Personaje personaje = new Personaje();
        bloqueIzquierda.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void testBloqueArribaSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(0, 1);
        BloqueArriba bloqueArriba = new BloqueArriba();
        Personaje personaje = new Personaje();
        bloqueArriba.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void testBloqueAbajoSeEjecutaYmueveAPersonaje(){
        Posicion posicion = new Posicion(0, -1);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Personaje personaje = new Personaje();
        bloqueAbajo.ejecutar(personaje);
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void testLapizAbajoCambiaElLapizDelPersonaje(){
        LapizAbajo lapizAbajo = new LapizAbajo();
        Personaje personaje = new Personaje();
        lapizAbajo.ejecutar(personaje);
        assertTrue(personaje.obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void testLapizArribaCambiaElLapizDelPersonaje(){
        LapizArriba lapizArriba = new LapizArriba();
        Personaje personaje = new Personaje();
        lapizArriba.ejecutar(personaje);
        assertTrue(personaje.obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void testBloqueRepetirRepiteDosVecesYmueveAlPersonaje(){
        Personaje personaje = new Personaje();
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2, personaje);
        AlgoBlocks algoBlocks = bloqueRepetir.agregarBloque();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueArriba();
        bloqueRepetir.ejecutar(personaje);
        Posicion posicion = new Posicion(-2,2);

        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void testBloqueRepetirRepiteTresVecesYmueveAlPersonaje(){
        Personaje personaje = new Personaje();
        BloqueRepetir bloqueRepetir = new BloqueRepetir(3, personaje);
        AlgoBlocks algoBlocks = bloqueRepetir.agregarBloque();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        bloqueRepetir.ejecutar(personaje);
        Posicion posicion = new Posicion(-6,0);

        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void testBloqueInversoInvierteAlgoritmo(){
        Personaje personaje = new Personaje();
        BloqueInverso bloqueInverso = new BloqueInverso(personaje);
        AlgoBlocks algoBlocks = bloqueInverso.agregarBloque();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueDerecha();
        bloqueInverso.ejecutar(personaje);
        List<Bloque> listaInvertida = new ArrayList<>();
        listaInvertida.add(new BloqueDerecha());
        listaInvertida.add(new BloqueArriba());
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
    public void testBloqueRepetirTieneSuPropioAlogoBlocksQueAñadeAListaDeBloqueRepetir(){
        Personaje personaje = new Personaje();
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2, personaje);
        AlgoBlocks algoBlocks = bloqueRepetir.agregarBloque();
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
    public void testBloqueIterativoCreaSuAlgoBlocks(){
        Personaje personaje = new Personaje();
        BloqueIterativo bloqueRepetir = new BloqueRepetir(2, personaje);

        assertTrue(bloqueRepetir.agregarBloque() instanceof AlgoBlocks);
    }
}