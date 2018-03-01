/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Juegos {

    String nombre, tipo, consola, dlc;
    float precio;
    boolean estado;
    int unidades;

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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Juegos() {
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

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tipo=" + tipo + ", consola=" + consola + ", dlc=" + dlc + ", precio=" + precio + ", estado=" + estado + ", unidades=" + unidades;
    }

    public Juegos nuevoJuego() {
        nombre = JOptionPane.showInputDialog("nombre");
        tipo = JOptionPane.showInputDialog("tipo");
        consola = JOptionPane.showInputDialog("consola");
        dlc = JOptionPane.showInputDialog("dlc");
        precio = Float.parseFloat(JOptionPane.showInputDialog("precio"));
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("estado"));
        unidades = Integer.parseInt(JOptionPane.showInputDialog("unidades"));

        Juegos j1 = new Juegos(nombre, tipo, consola, dlc, precio, estado, unidades, codigo);
        return j1;

    }

}
