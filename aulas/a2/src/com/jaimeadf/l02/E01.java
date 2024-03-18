package com.jaimeadf.l02;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("a - b = " + (a - b));
        } else {
            System.out.println("b - a = " + (b - a));
        }
    }
}
