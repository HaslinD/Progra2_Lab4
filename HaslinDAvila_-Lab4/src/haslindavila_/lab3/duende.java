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
public class duende extends tablero{

    public duende() {
        super();
    }

    public duende(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "duende{" + '}';
    }

    @Override
    public String movimientos() {
        return "";
    }
    
}
