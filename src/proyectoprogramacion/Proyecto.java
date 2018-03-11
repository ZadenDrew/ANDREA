package proyectoprogramacion;

import ficheros.Escritura;
import ficheros.Lectura;
import java.io.File;
import java.util.*;

public class Proyecto {

    static Juegos juego = new Juegos();
    static Map<Integer, Juegos> mapaJuegos = new TreeMap<>();

    public static void main(String[] args) {

        juego = new Juegos();
        Juegos j1 = juego.nuevoJuego();

        Escritura e = new Escritura();
        Lectura l = new Lectura();
        Codigos cod = new Codigos();
        e.escribir(new File("juegos.txt"), cod.codigo(), j1, mapaJuegos);
        e.escribeCodigo(new File("codigos.txt"), cod.codigo());
        l.leer(new File("juegos.txt"));
    

    }

}
