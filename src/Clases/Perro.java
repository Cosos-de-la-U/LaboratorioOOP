/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author raulpenate
 */
public class Perro extends Animal {

    @Override
    public void accion() {
        JOptionPane.showMessageDialog(null, "El perro ladra");
    }

    @Override
    public void setNaturaleza(String naturaleza) {
        super.setNaturaleza(naturaleza); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNaturaleza() {
        return super.getNaturaleza(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRaza() {
        return super.getRaza(); //To change body of generated methods, choose Tools | Templates.
    }

}
