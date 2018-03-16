package proyectoprogramacion;

import ficheros.Lectura;
import java.io.File;
import personalizacion_grafica.Administrar;
import static personalizacion_grafica.Administrar.mapaJuegos;

public class Proyecto {

    // static Juegos juego = new Juegos();
    // static Map<Integer, Juegos> mapaJuegos = new TreeMap<>();
    public static void main(String[] args) {
        Juegos j2;
//        juego = new Juegos();
//        Juegos j1 = juego.nuevoJuego();
//
//        Escritura e = new Escritura();
        Lectura l = new Lectura();
//        e.escribir(new File("juegos.txt"), j1.getCodigo(), j1, mapaJuegos);
//        e.escribeCodigo(new File("codigos.txt"), j1.getCodigo());
//        l.leer(new File("juegos.txt"));
        String completo = l.leerCompleto(new File("juegos.txt"));
        String[] aux = completo.split("\n");
        for (int i = 0; i < aux.length; i++) {
            String[] auxArray = aux[i].split(":codigo, ");
            String[] aux3,aux2;
            if (i > 0) {
                aux2 = auxArray[i].split("\\s*,\\s*");
                aux3 = aux2[i].split("\\s*:\\s*");
                for (int j = 0; j < aux2.length; j++) {
                    j2 = new Juegos(aux3[1], aux3[2], aux3[3], aux3[4], (Float.parseFloat(aux3[5])), (Boolean.parseBoolean(aux3[6])), (Integer.parseInt(aux3[7])));
                    mapaJuegos.put(Integer.parseInt(aux[0]), j2);
                }

            }
        }

        Administrar admin = new Administrar();
        admin.setVisible(true);
    }

}
