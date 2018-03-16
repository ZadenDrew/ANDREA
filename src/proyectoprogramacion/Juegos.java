package proyectoprogramacion;

import ficheros.Lectura;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Juegos {

    static int codigo = 0;
    String nombre, tipo, consola, dlc;
    float precio;
    boolean estado;
    int unidades;

    public Juegos() {
    }

    public Juegos(int codigo, String nombre, String tipo, String consola, String dlc, float precio, boolean estado, int unidades) {
        Juegos.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.consola = consola;
        this.dlc = dlc;
        this.precio = precio;
        this.estado = estado;
        this.unidades = unidades;
    }

    public Juegos(String nombre, String tipo, String consola, String dlc, float precio, boolean estado, int unidades) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.consola = consola;
        this.dlc = dlc;
        this.precio = precio;
        this.estado = estado;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getDlc() {
        return dlc;
    }

    public void setDlc(String dlc) {
        this.dlc = dlc;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        Juegos.codigo = codigo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return (":código, " + "nombre:" + nombre + ", tipo:" + tipo + ", consola:" + consola + ", dlc:" + dlc + ", precio:" + precio + ", estado:" + estado + ", codigo:" + codigo + ", unidades:" + unidades);
    }

    public Juegos nuevoJuego() {
        Lectura l = new Lectura();
        codigo = l.leerCodigo(new File("codigos.txt")) + 1;
        nombre = JOptionPane.showInputDialog("nombre");
        tipo = JOptionPane.showInputDialog("tipo");
        consola = JOptionPane.showInputDialog("consola");
        dlc = JOptionPane.showInputDialog("dlc");
        precio = Float.parseFloat(JOptionPane.showInputDialog("precio"));
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("estado"));
        unidades = Integer.parseInt(JOptionPane.showInputDialog("unidades"));

        Juegos j1 = new Juegos(codigo, nombre, tipo, consola, dlc, precio, estado, unidades);
        return j1;

    }


}
