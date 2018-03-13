package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoprogramacion.Juegos;

/**
 *
 * @author estudios
 */
public class Escritura {

    public void escribir(File fichero, int cod, Juegos j1, Map mapaJuegos) {
        try {

            try (PrintWriter writer = new PrintWriter(new FileWriter(fichero, true))) {
                mapaJuegos.put(cod, j1);
                writer.println(cod + j1.toString());
            }

        } catch (IOException ex) {
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void escribeCodigo(File fichero, int cod) {
        try {

            try (PrintWriter writer = new PrintWriter(new FileWriter(fichero))) {
                writer.println(cod);
            }

        } catch (IOException ex) {
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
