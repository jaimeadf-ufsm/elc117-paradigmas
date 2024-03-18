package com.jaimeadf.l02;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " é par.");
        } else {
            System.out.println(n + " é ímpar.");
        }
    }
}
