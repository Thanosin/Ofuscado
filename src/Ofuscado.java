import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Ofuscado {
    //método imprime que se encarga de imprimir en pantalla los que le pasen
    public static void imprime (String texto) {
        System.out.println(texto);
    }
    //método que realiza un cálculo con el entero que se le pase
    public static int calculo (int numero) {
        if (numero == 0) {
            return 1;
        }else{
            int factorial = 1;
            int contador = numero;
            do {
                factorial *= contador;
                contador--;
            } while(contador > 0);
            return factorial;
        }
    }
    //llamamos al método reverso porque devuelve una palabra al revés
    public static String reverso (String palabra) {
        String reves = "";
        int puntero = 0;
        do{
            reves = palabra.charAt(puntero) + reves;
            puntero++;
        }while(puntero < palabra.length());
        reves = palabra + reves;
        return reves;
    }
    public static void main(String[] args) throws IOException {
        Scanner escaner = new Scanner(System.in);
        int control;
        do {
            control = imprimirMenu(escaner);
            if (control == 1) {
                imprime("Inserte un número:");
                String leerEntero = escaner.nextLine();
                int entero = Integer.parseInt(leerEntero);
                int factorial = calculo(entero);
                imprime("El resultado es:");
                imprime("" + factorial);
            } else {
                if (control == 2) {
                    imprime("Inserte una palabra:");
                    String leerTexto = escaner.nextLine();
                    String reves = reverso(leerTexto);
                    imprime("El resultado es:");
                    imprime("" + reves);
                }
            }
        }while(control != 3);
    }
    private static int imprimirMenu(Scanner escaner) {
        int control;
        imprime("BIENVENIDO AL PROGRAMA OFUSCADO");
        imprime("-------------------------------");
        imprime("Elija una opcion:");
        imprime("1) Calcular el factorial de un número entero");
        imprime("2) Darle la vuelta a un texto");
        imprime("3) Fin del programa");
        imprime(">");
        String leerControl = escaner.nextLine();
        control = Integer.parseInt(leerControl);
        return control;
    }
}