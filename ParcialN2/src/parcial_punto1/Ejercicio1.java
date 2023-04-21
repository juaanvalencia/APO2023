package parcial_punto1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        
        char[] caracteres = frase.toCharArray();
        
        for (char c : caracteres) {
            System.out.println(c);
        }
    }
}