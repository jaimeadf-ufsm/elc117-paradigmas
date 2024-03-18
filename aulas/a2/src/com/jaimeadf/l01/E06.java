package com.jaimeadf.l01;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quatro números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        double media = (a + b * 2 + c * 3 + d * 4) / 10;

        System.out.println("Média ponderada: " + media);
    }
}
