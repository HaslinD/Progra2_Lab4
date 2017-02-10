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
