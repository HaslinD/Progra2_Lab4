package haslindavila_.lab3;

//Haslin David y Josue Garcia

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HaslinDAvila_Lab3 {
    private static String nombre;
    private static String nuser;
    private static int puntos;
    private static String lugar_de_nacimiento;
    private static int edad;
    private static String genero;
    public static void main(String[] args) {
        ArrayList<jugadores> jugador = new ArrayList(); 
        
        int opt = 0;
        do {
            String MenuP = "--Menu--\n"
                    + "1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n";
            opt = Integer.parseInt(JOptionPane.showInputDialog(MenuP));
            switch (opt){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (opt > 0 && opt < 5);
    }
}