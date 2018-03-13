package proyectoprogramacion;


import personalizacion_grafica.Administrar;

public class Proyecto {

   // static Juegos juego = new Juegos();
   // static Map<Integer, Juegos> mapaJuegos = new TreeMap<>();

    public static void main(String[] args) {

//        juego = new Juegos();
//        Juegos j1 = juego.nuevoJuego();
//
//        Escritura e = new Escritura();
//        Lectura l = new Lectura();
//        e.escribir(new File("juegos.txt"), j1.getCodigo(), j1, mapaJuegos);
//        e.escribeCodigo(new File("codigos.txt"), j1.getCodigo());
//        l.leer(new File("juegos.txt"));

        Administrar admin = new Administrar();
        admin.setVisible(true);
    }

}
