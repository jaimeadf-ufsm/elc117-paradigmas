package com.jaimeadf.l02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite três números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0) {
            System.out.println("sqrt(a) = " + a);
        }

        if (b > 10 && b < 100) {
            System.out.println("O número b está entre 10 e 100");
        }

        if (c < b) {
            System.out.println("c - b = " + (c - b));
        } else {
            System.out.println("c + 1 = " + (c + 1));
        }
    }
}
