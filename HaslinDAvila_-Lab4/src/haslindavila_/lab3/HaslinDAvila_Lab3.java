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
                    + "2. Listar\n"
                    + "3. Eliminar\n";
            opt = Integer.parseInt(JOptionPane.showInputDialog(MenuP));
            switch (opt) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    nuser = JOptionPane.showInputDialog("Ingrese nombre de Usuario");
                    puntos = 0;
                    lugar_de_nacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
                    genero = JOptionPane.showInputDialog("Ingrese Genero [F/M]");
                    jugador.add(new jugadores(nombre, nuser, puntos, lugar_de_nacimiento, genero, edad));
                    break;
                case 2:
                    String elementos = "";
                    for (Object t : jugador) {
                        if (t instanceof jugadores) {
                            elementos += jugador.indexOf(t) + " " + ((jugadores) t) + "\n";
                        }
                    }
                    break;
                case 3:
                    String elemento = "";
                    for (Object t : jugador) {
                        if (t instanceof jugadores) {
                            elemento += jugador.indexOf(t) + " " + ((jugadores) t) + "\n";
                        }
                    }
                    break;
            }
        } while (opt > 0 && opt < 5);
    }
}
