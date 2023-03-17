package taller6;

import java.util.Arrays;

public class Punto4 {
    public static void main(String[] args) {
        byte[] valores = new byte[10];
        Arrays.fill(valores, (byte) 1);
        System.out.println(valores[0]); // muestra 1
        System.out.println(valores[9]); // muestra 1
    }
}


