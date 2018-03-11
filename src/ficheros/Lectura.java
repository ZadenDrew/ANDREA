package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Lectura {

    String ficheroCompleto = "";
    String ficheroCompletoCod = "";
    String line = "";

    public void leer(File fichero) {

        try {

            final BufferedReader reader = new BufferedReader(new FileReader(fichero));
            try {

                while ((line = reader.readLine()) != null) {
                    ficheroCompleto = ficheroCompleto + "\n" + line;
                }

                JOptionPane.showMessageDialog(null, ficheroCompleto);
                reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("fichero no encontrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public int leerCodigo(File fichero) {
        int cod = 0;
        try {

            final BufferedReader reader = new BufferedReader(new FileReader(fichero));
            try {
                while ((line = reader.readLine()) != null) {
                    ficheroCompletoCod = ficheroCompletoCod + "\n" + line;
                    cod = Integer.parseInt(line);
                }
                JOptionPane.showMessageDialog(null, ficheroCompleto);
                reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("fichero no encontrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        }
        return cod;

    }
}
