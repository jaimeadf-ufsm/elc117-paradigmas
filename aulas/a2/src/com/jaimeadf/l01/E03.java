package com.jaimeadf.l01;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.println("Predecessor: " + (n - 1));
        System.out.println("Sucessor: " + (n + 1));
    }
}
