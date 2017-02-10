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
public class mago extends tablero {

    public mago() {
        super();
    }

    public mago(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "mago{" + '}';
    }

    @Override
    public void movimientos(String[][] cad, int x, int y, int x2, int y2) {
        for (int i = 0; i < cad.length; i++) {
            for (int j = 0; j < cad.length; j++) {
                if ((i == x2 && j == y2) &&  (i >= 0 && j >= 0 || i < cad.length - 1 && j < cad[0].length - 1)) {
                    cad[i][j] = cad[x][y];
                    cad[x][y] = "   ";
                }
            }
        }
    }

 
    
}
