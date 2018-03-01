/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoprogramacion.Juegos;
import static proyectoprogramacion.Proyecto.listaJuegos;

/**
 *
 * @author estudios
 */
public class Escritura {

    public void escribir(File fichero,Juegos j1) {
        try {
            
            final PrintWriter writer = new PrintWriter(new FileWriter(fichero,true));
            listaJuegos.add(j1);
            writer.println(j1.toString());
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
