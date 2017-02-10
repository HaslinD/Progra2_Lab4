/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haslindavila_.lab3;

import java.awt.Color;

/**
 *
 * @author Fiery_000
 */
public class Duende extends tablero {

    
    public Duende() {
        super();
    }

    public Duende(Color color, String material) {
        super(color, material);
    }

    public String toString() {
        return "Duende{" + '}';
    }

    @Override
    public void movimientos(String[][] cad, int x, int y, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
