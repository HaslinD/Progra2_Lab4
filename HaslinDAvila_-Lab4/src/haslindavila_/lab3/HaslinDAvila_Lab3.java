package haslindavila_.lab3;

//Haslin David y Josue Garcia
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HaslinDAvila_Lab3 {
    static char[][] tableroA;
    private static String nombre;
    private static String nuser;
    private static int puntos;
    private static String lugar_de_nacimiento;
    private static int edad;
    private static String genero;

    public static void main(String[] args) {
        ArrayList<jugadores> jugador = new ArrayList();
        tableroA = new char[10][10]; 
        int opt = 0;
        do {
            String MenuP = "--Menu--\n"
                    + "1. Agregar\n"
                    + "2. Listar\n"
                    + "3. Eliminar\n"
                    + "4. Tablero\n"
                    + "Ingrese la Opcion Siguiente: ";
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
                    JOptionPane.showMessageDialog(null, elementos);
                    break;
                case 3:
                    int pos = 0;
                    String elemento = "";
                    for (Object t : jugador) {
                        if (t instanceof jugadores) {
                            elemento += jugador.indexOf(t) + " " + ((jugadores) t) + "\n";
                        }
                    }
                    pos = Integer.parseInt(JOptionPane.showInputDialog(elemento));
                    jugador.remove(pos);
                    break;
                case 4:
                    espacios();
                    matriz(tableroA, 0 ,0);
                    break;
            }
        } while (opt > 0 && opt < 5);
    }
    public static void matriz(char[][] m, int f, int c){
        if (f == m.length - 1 && c == m[0].length - 1)
            System.out.println("[" + m[f][c] + "]");
        else if (c == m[0].length - 1){
            System.out.println("["+m[f][c]+"]");
            matriz(m,f + 1,0);
        } else {
            System.out.print("[" + m[f][c] + "]");
            matriz(m,f,c+1);
        }
    }
    public static char[][] espacios(){
        for (int i = 0; i < tableroA.length; i++) {
            for (int j = 0; j < tableroA.length; j++) {
                tableroA[i][j] = ' ';
            }
        }
        return tableroA;
    }
}
