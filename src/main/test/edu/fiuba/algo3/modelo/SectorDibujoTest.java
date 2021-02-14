package edu.fiuba.algo3.modelo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SectorDibujoTest {

    private boolean compararDibujos(List<Trazo> dibujoEsperado, List<Trazo> dibujoSectorDibujo){
        for(int i = 0; i < dibujoEsperado.size(); i++)
            if (!dibujoEsperado.get(i).esIgualA(dibujoSectorDibujo.get(i))) {
                return false;
            }
        return true;
    }

    @Test
    public void testSeCreaSectorDibujo(){
        assertTrue(SectorDibujo.obtenerSectorDibujo() instanceof SectorDibujo);
    }

    @Test
    public void testSectorDibujoSeCreavacio(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        SectorDibujo sectorDibujo = SectorDibujo.obtenerSectorDibujo();
        assertEquals(0, sectorDibujo.obtenerDibujo().size());
    }

    @Test
    public void testTrazarVariasVecesSinLevantarElLapis(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Trazo> trazos = new ArrayList<>();
        List<Trazo> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Trazo(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Trazo(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Trazo(new Posicion(1, -1), new Posicion(0, -1)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void testTrazarLevantadoElLapizAlFinal(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Trazo> trazos = new ArrayList<>();
        List<Trazo> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Trazo(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Trazo(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Trazo(new Posicion(1, -1), new Posicion(0, -1)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void testTrazarLevantarElLapizBajarloYVolverATrazar(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Trazo> trazos = new ArrayList<>();
        List<Trazo> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Trazo(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Trazo(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Trazo(new Posicion(1, -1), new Posicion(2, -1)));
        trazos.add(new Trazo(new Posicion(2, -1), new Posicion(2, 0)));
        trazos.add(new Trazo(new Posicion(2, 0), new Posicion(1, 0)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarLapizArriba();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void testTrazarLevantarElLapizMoverBajarLapzizSeTrazoDosVeces(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Trazo> trazos = new ArrayList<>();
        List<Trazo> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Trazo(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Trazo(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Trazo(new Posicion(1, -1), new Posicion(1, -2)));
        trazos.add(new Trazo(new Posicion(1, -2), new Posicion(2, -2)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarLapizArriba();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

}