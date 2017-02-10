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
public class Caballero extends tablero {

    public Caballero() {
        super();
    }

    public Caballero(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "Caballero{" +"C"+ '}';
    }

    @Override
    public String[][] movimientos(String[][] cad, int x, int y, int x2, int y2) {
        for (int i = 0; i < cad.length; i++) {
            for (int j = 0; j < cad.length; j++) {
                if ((x == x2 && y == y2) &&  (i >= 0 && j >= 0 || i < cad.length - 1 && j < cad[0].length - 1)) {
                    cad[i][j] = cad[x][y];
                    cad[i][j] = "   ";
                }
            }
        }
        return cad;
    }

    
    
    
   
 

    
}
