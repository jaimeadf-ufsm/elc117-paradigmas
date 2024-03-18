package com.jaimeadf.l01;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite três números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double media = (a + b + c) / 3.0;

        System.out.println("Média: " + media);
    }
}
