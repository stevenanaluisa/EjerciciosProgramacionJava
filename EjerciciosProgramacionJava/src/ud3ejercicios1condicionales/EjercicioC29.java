package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC29 {

    public static void main(String[] args) {

        // Variables
        int h, m, s;
        boolean valida = false;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos la hora
        System.out.print("Hora: ");
        h = in.nextInt();
        System.out.print("Minutos: ");
        m = in.nextInt();
        System.out.print("Segundos: ");
        s = in.nextInt();
        
        // Calculamos la hora 1 segundo después
        s++;
        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }
        
        // Mostramos la nueva hora
        System.out.println("Nueva hora: " + h + ":" + m + ":" + s);

    }
}
