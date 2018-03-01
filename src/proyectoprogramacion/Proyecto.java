
package proyectoprogramacion;

import ficheros.Escritura;
import ficheros.Lectura;
import java.io.File;
import java.util.*;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;



public class Proyecto {
        static Juegos juego= new Juegos();
        
    public static void main(String[] args) {
        
        
            juego= new Juegos();
           Juegos j1=juego.nuevoJuego();
           
           listaJuegos.add(j1);
        Escritura e = new Escritura();
        Lectura l=new Lectura();
        e.escribir(new File("juegos.txt"),j1);
        l.leer(new File("juegos.txt"));
            
            
    }
    
}
