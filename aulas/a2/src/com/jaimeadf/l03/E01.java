package com.jaimeadf.l03;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();
        double s = 0;


        for (int i = 1; i <= n; i++) {
            s += (2.0 * i - 1.0) / i;
        }

        System.out.println("S = " + s);
    }
}
