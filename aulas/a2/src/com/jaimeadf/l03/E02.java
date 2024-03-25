package com.jaimeadf.l03;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double media = 0;

        double n = 0.0;

        System.out.println("Digite valores (-1 para parar):");

        do {
            n = scanner.nextDouble();

            if (n > 0.0) {
                contador++;
                media += n;
            }
        } while (n > 0.0);

        media /= n;

        System.out.println("Média: " + media);
    }
}
