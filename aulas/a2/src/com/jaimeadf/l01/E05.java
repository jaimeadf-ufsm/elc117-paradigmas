package com.jaimeadf.l01;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = scanner.nextInt();

        System.out.println(n + " / " + "3 =" + (n / 3.0));
    }
}
