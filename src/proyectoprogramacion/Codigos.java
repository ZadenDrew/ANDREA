package proyectoprogramacion;

import ficheros.Lectura;
import java.io.File;

/**
 *
 * @author estudios
 */
public class Codigos {

    static int codigo=0;

    public Codigos() {
    }

    public int codigo() {
        Lectura l = new Lectura();
        codigo = l.leerCodigo(new File("codigos.txt"));
        return codigo + 1;

    }

}
