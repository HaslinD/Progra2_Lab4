/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haslindavila_.lab3;

import java.awt.Color;

/**
 *
 * @author Franklin Garcia
 */
public abstract class tablero  {
    protected Color color;
    protected String material;

    public tablero() {
    }
   
    public tablero(Color color) {
        this.color = color;
    }

    public tablero(Color color, String material) {
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "tablero{" + "color=" + color + ", material=" + material + '}';
    }
   
    public abstract void movimientos(String [][]cad, int x, int y, int x2, int y2);
    
}
