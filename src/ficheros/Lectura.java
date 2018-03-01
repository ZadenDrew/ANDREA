/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Lectura {
        String ficheroCompleto="";
    public void leer(File fichero) {
        try {

            final BufferedReader reader = new BufferedReader(new FileReader(fichero));
            try {
                String line = "";
            while ((line = reader.readLine()) != null) {
                ficheroCompleto = ficheroCompleto + "\n" + line;
            }

            JOptionPane.showMessageDialog(null, ficheroCompleto);
                reader.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("fichero no encontrado");
                }} catch (IOException ex) {
                Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
            
        
        }

    }
}
