package edu.fiuba.algo3.modelo;

import javafx.geometry.Pos;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoBlocksTest {

    private boolean compararDibujos(List<Segmento> dibujoEsperado, List<Segmento> dibujoSectorDibujo){
        for(int i = 0; i < dibujoEsperado.size(); i++)
            if (!dibujoEsperado.get(i).esIgualA(dibujoSectorDibujo.get(i))) {
                return false;
            }
        return true;
    }

    @Test
    public void test01LevantarLapizConBloqueLevantaLapizPersonajeLevantaElLapiz(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarLapizArriba();
        algoritmo.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test02BajarLapizConBloqueBajaLazpizPersonajeBajaElLapiz(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarLapizAbajo();
        algoritmo.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizAbajo);
    }

    @Test
    public void test03MoverDerechaConBloqueMoverDerechaPersonajeSeMueveALaDerecha(){
        Posicion posicion = new Posicion(1, 0);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test04MoverAbajoConBloqueMoverAbajoPersonajeSeMueveAbajo(){
        Posicion posicion = new Posicion(0, -1);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);;
        algoBlocks.agregarBloqueAbajo();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test05MoverIzquierdaConBloqueMoverIzquierdaPersonajeSeMueveIzquierda(){
        Posicion posicion = new Posicion(-1 , 0);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);;
        algoBlocks.agregarBloqueIzquierda();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test06MoverArribaConBloqueMoverArribaPersonajeSeMueveArriba(){
        Posicion posicion = new Posicion(0, 1);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test07MoverEnVariasDireccionesHorizontalesPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(-1, 0);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);;
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueDerecha();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test08MoverEnVariasDireccionesVerticalesPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(0, 1);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test09MoverEnDireccionesVerticalesYhorizontalesPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(1, 1);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueIzquierda();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test10MoverEnDistintasDireccionesYsubirLapiz(){
        Posicion posicion = new Posicion(0, 0);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
        assertTrue(algoBlocks.obtenerPersonaje().obtenerLapiz() instanceof LapizArriba);
    }

    @Test
    public void test11MoverEnDistintasDireccionesNoAfectaAlLapiz() {
        Posicion posicion = new Posicion(0,  0);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueIzquierda();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test12UsarBloqueRepetirDosVecesYPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(3, -1);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirDosVeces = algoBlocks.agregarBloqueRepetirDosVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirDosVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test13UsarBloqueRepetirTresVecesYPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(4, -2);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirTresVeces = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirTresVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoritmo.ejecutar();
        assertTrue(personaje.obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test14AgregarBloquesDeMovimientoSimlesDespuesDeAgregarBloquesDeRepetirPersonajeSeMueveCorrectamente(){
        Posicion posicion = new Posicion(4, 0);
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo(personaje);
        AlgoBlocks algoBlocks = new AlgoBlocks(algoritmo.obtenerRecorrido(), personaje);
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        BloqueRepetir bloqueRepetirTresVeces = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirTresVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueArriba();
        algoritmo.ejecutar();
        assertTrue(algoBlocks.obtenerPersonaje().obtenerPosicion().esIgualA(posicion));
    }

    @Test
    public void test15UsarBloqueInversoYPersonajeRealizaMovimientosAlReves(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks( (new Algoritmo(personaje)).obtenerRecorrido(), personaje);
        BloqueInverso bloqueInverso = algoBlocks.agregarBloqueInverso();
        AlgoBlocks inverso = bloqueInverso.agregarBloque();
        inverso.agregarBloqueDerecha();
        inverso.agregarBloqueAbajo();
        List<Bloque> listaInvertida = new ArrayList<>();
        listaInvertida.add(new BloqueAbajo());
        listaInvertida.add(new BloqueDerecha());
        bloqueInverso.ejecutar(personaje);
        boolean esDiferente = false;
        if(listaInvertida.size() != bloqueInverso.obtenerLista().size())
            esDiferente = true;
        else {
            for(int i = 0; i < listaInvertida.size(); i++){
                if((listaInvertida.get(i)).getClass() != (bloqueInverso.obtenerLista().get(i)).getClass())
                    esDiferente = true;
            }
        }
        assertFalse(esDiferente);
    }

    @Test
    public void test16TrazarVariasVecesSinLevantarElLapiz(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Segmento(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Segmento(new Posicion(1, -1), new Posicion(0, -1)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void test17TrazarLevantadoElLapizAlFinal(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Segmento(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Segmento(new Posicion(1, -1), new Posicion(0, -1)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizArriba();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void test18TrazarLevantarElLapizBajarloYVolverATrazar(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Segmento(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Segmento(new Posicion(1, -1), new Posicion(2, -1)));
        trazos.add(new Segmento(new Posicion(2, -1), new Posicion(2, 0)));
        trazos.add(new Segmento(new Posicion(2, 0), new Posicion(1, 0)));
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
    public void test19TrazarLevantarElLapizMoverBajarLapzizSeTrazoDosVeces(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Segmento(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Segmento(new Posicion(2, 0), new Posicion(2, -1)));
        trazos.add(new Segmento(new Posicion(2, -1), new Posicion(3, -1)));
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

    @Test
    public void test20LevantarYBajarElLapizMuchasVecesEnDiferenteOrdenYTrazarConLapizBajo(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(-1, 0)));
        trazos.add(new Segmento(new Posicion(-1, 0), new Posicion(-2, -0)));
        trazos.add(new Segmento(new Posicion(-2, 0), new Posicion(-2, -1)));
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarLapizArriba();
        algoBlocks.agregarLapizArriba();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void test21AgregarBloquesDeMovimientoSinBajarLapizDespuesBajarloYAgregarMas(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(1, 2), new Posicion(0, 2)));
        trazos.add(new Segmento(new Posicion(0, 2), new Posicion(0, 1)));
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarBloqueDerecha();
        algoBlocks.agregarBloqueArriba();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.agregarBloqueIzquierda();
        algoBlocks.agregarLapizAbajo();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }
    @Test
    public void test22AgregarLapizAbajoYRepetirDosVecesElTrazoConBloquesDeMovimiento(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Segmento(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Segmento(new Posicion(1, -1), new Posicion(2, -1)));
        trazos.add(new Segmento(new Posicion(2, -1), new Posicion(2, -2)));
        algoBlocks.agregarLapizAbajo();
        BloqueRepetir bloqueRepetirDosVeces = algoBlocks.agregarBloqueRepetirDosVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirDosVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void test23AgregarLapizAbajoYRepetirTresVecesElTrazoConBloquesDeMovimiento(){
        SectorDibujo.obtenerSectorDibujo().resetear();
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(1, 0)));
        trazos.add(new Segmento(new Posicion(1, 0), new Posicion(1, -1)));
        trazos.add(new Segmento(new Posicion(1, -1), new Posicion(2, -1)));
        trazos.add(new Segmento(new Posicion(2, -1), new Posicion(2, -2)));
        trazos.add(new Segmento(new Posicion(2, -2), new Posicion(3, -2)));
        trazos.add(new Segmento(new Posicion(3, -2), new Posicion(3, -3)));
        algoBlocks.agregarLapizAbajo();
        BloqueRepetir bloqueRepetirTresVeces = algoBlocks.agregarBloqueRepetirTresVeces();
        AlgoBlocks algoritmoIterativo = bloqueRepetirTresVeces.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }

    @Test
    public void test24AgregarLapizAbajoAgregarBloqueInversoElOrdenDelTrarzoEsElCorrecto(){
        Personaje personaje = new Personaje();
        AlgoBlocks algoBlocks = new AlgoBlocks(new Recorrido(personaje).obtenerRecorrido(), personaje);
        List<Segmento> trazos = new ArrayList<>();
        List<Segmento> dibujo = SectorDibujo.obtenerSectorDibujo().obtenerDibujo();
        trazos.add(new Segmento(new Posicion(0, 0), new Posicion(0, -1)));
        trazos.add(new Segmento(new Posicion(0, -1), new Posicion(1, -1)));
        algoBlocks.agregarLapizAbajo();
        BloqueInverso bloqueInverso = algoBlocks.agregarBloqueInverso();
        AlgoBlocks algoritmoIterativo = bloqueInverso.agregarBloque();
        algoritmoIterativo.agregarBloqueDerecha();
        algoritmoIterativo.agregarBloqueAbajo();
        algoBlocks.ejecutar();
        assertTrue(this.compararDibujos(trazos, dibujo));
    }
}