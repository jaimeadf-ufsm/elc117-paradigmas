package com.jaimeadf.l01;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("Soma: " + soma);
    }
}
