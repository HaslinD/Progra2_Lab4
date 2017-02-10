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
public class arquero extends tablero{

    public arquero() {
        super();
    }

    public arquero(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "arquero{" + '}';
    }

    @Override
    public void movimientos(String[][] cad, int x, int y, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
