package haslindavila_.lab3;

//Haslin David y Josue Garcia
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HaslinDAvila_Lab3 {

    
    private static String nombre;
    private static String nuser;
    private static int puntos;
    private static String lugar_de_nacimiento;
    private static int edad;
    private static String genero;
    
    public static void main(String[] args) {
        
        Scanner lectura=new Scanner(System.in);
        Caballero caballero = new Caballero();
        
        
        ArrayList<jugadores> jugador = new ArrayList();
        int opt = 0;
        int opt2 = 0;
        do {
            String MenuPP = "--Menu--\n"
                    + "1. Jugador\n"
                    + "2. Jugar\n"
                    + "3. Salir\n"
                    + "Ingrese o Elija su Opcion: ";
            opt = Integer.parseInt(JOptionPane.showInputDialog(MenuPP));
            switch (opt) {
                case 1:
                    do {
                        String MenuP = "--Menu--\n"
                                + "1. Agregar\n"
                                + "2. Listar\n"
                                + "3. Eliminar\n"
                                + "Ingrese la Opcion Siguiente: ";
                        opt2 = Integer.parseInt(JOptionPane.showInputDialog(MenuP));
                        switch (opt2) {
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
                        }
                    } while (opt2 > 0 && opt2 < 5);
                    break;
                case 2:
                    String[][] tableroA = new String[10][10]; 
                    System.out.println(Print(piezas(tableroA)));

                    int x, y, x2, y2;
                    System.out.println("Ingrese pos X");
                    x2 = lectura.nextInt();
                    System.out.println("Ingrese pos Y");
                    y2 = lectura.nextInt();
                    System.out.println("Ingrese mov a X");
                    x = lectura.nextInt();
                    System.out.println("Ingrese mov a Y");
                    y = lectura.nextInt();
                    caballero.movimientos(tableroA, x, y, x2, y2);
                    System.out.println(Print(tableroA));
                    break;

            }
        } while (opt > 0 && opt < 3);
    }

    public static String Print(String[][] t) {
        String c = "";
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                c = c + "[ " + t[i][j] + " ]";
            }
            c += "\n";
        }
        return c;
    }
    
    public static String[][] piezas(String[][] tableroA){
        for (int i = 0; i < tableroA.length; i++) {
            for (int j = 0; j < tableroA.length; j++) {
                if (i >= 0 && j >= 0 || i < tableroA.length - 1 && j < tableroA[0].length - 1) {
                    if (i == 0 && j == 0) {
                        tableroA[i][j] = "C-N";
                    }
                    else if (i == 1 && j == 0) {
                        tableroA[i][j] = "D-N";
                    }
                    else if (i == 0 && j == 2) {
                        tableroA[i][j] = "F-N";
                    }
                    else if (i == 1 && j == 2) {
                        tableroA[i][j] = "A-N";
                    }
                    else if (i == 0 && j == 3) {
                        tableroA[i][j] = "A-N";
                    }
                    else if (i == 1 && j == 3) {
                        tableroA[i][j] = "D-N";
                    }
                    else if (i == 0 && j == 4) {
                        tableroA[i][j] = "R-N";
                    }
                    else if (i == 1 && j == 4) {
                        tableroA[i][j] = "C-N";
                    }
                    else if (i == 0 && j == 5) {
                        tableroA[i][j] = "M-N";
                    }
                    else if (i == 1 && j == 5) {
                        tableroA[i][j] = "F-N";
                    }
                    else if (i == 0 && j == 6) {
                        tableroA[i][j] = "A-N";
                    }
                    else if (i == 1 && j == 6) {
                        tableroA[i][j] = "D-N";
                    }
                    else if (i == 0 && j == 7) {
                        tableroA[i][j] = "F-N";
                    }
                    else if (i == 1 && j == 7) {
                        tableroA[i][j] = "A-N";
                    }
                    else if (i == 0 && j == 9) {
                        tableroA[i][j] = "C-N";
                    }
                    else if (i == 1 && j == 9) {
                        tableroA[i][j] = "D-N";
                    }
                    //--------------------------------------------------------\\
                    else if (i == 9 && j == 0) {
                        tableroA[i][j] = "C-B";
                    }
                    else if (i == 8 && j == 0) {
                        tableroA[i][j] = "D-B";
                    }
                    else if (i == 9 && j == 2) {
                        tableroA[i][j] = "F-B";
                    }
                    else if (i == 8 && j == 2) {
                        tableroA[i][j] = "A-B";
                    }
                    else if (i == 9 && j == 3) {
                        tableroA[i][j] = "A-B";
                    }
                    else if (i == 8 && j == 3) {
                        tableroA[i][j] = "D-B";
                    }
                    else if (i == 9 && j == 4) {
                        tableroA[i][j] = "R-B";
                    }
                    else if (i == 8 && j == 4) {
                        tableroA[i][j] = "C-B";
                    }
                    else if (i == 9 && j == 5) {
                        tableroA[i][j] = "M-B";
                    }
                    else if (i == 8 && j == 5) {
                        tableroA[i][j] = "F-B";
                    }
                    else if (i == 9 && j == 6) {
                        tableroA[i][j] = "A-B";
                    }
                    else if (i == 8 && j == 6) {
                        tableroA[i][j] = "D-B";
                    }
                    else if (i == 9 && j == 7) {
                        tableroA[i][j] = "F-B";
                    }
                    else if (i == 8 && j == 7) {
                        tableroA[i][j] = "A-B";
                    }
                    else if (i == 9 && j == 9) {
                        tableroA[i][j] = "C-B";
                    }
                    else if (i == 8 && j == 9) {
                        tableroA[i][j] = "D-B";
                    }
                    else 
                        tableroA[i][j] = "   ";
                }
            }
        }
        return tableroA;
    }
}
