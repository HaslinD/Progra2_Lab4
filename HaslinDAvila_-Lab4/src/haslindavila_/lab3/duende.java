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

    @Override
    public String toString() {
        return "Duende{" + '}';
    }

    @Override
    public String movimientos() {
        return "";
    }
    
}
