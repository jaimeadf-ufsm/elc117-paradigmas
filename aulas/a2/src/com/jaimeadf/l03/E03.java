package com.jaimeadf.l03;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        int soma_pares = 0;
        int soma_impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + i + ": ");
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                pares++;
                soma_pares += n;
            } else {
                impares++;
                soma_impares += n;
            }
        }

        double media_impares = soma_impares / impares;

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        System.out.println("Soma dos pares: " + soma_pares);
        System.out.println("Soma dos impares: " + soma_impares);
        System.out.println("Media dos impares: " + media_impares);
    }
}
