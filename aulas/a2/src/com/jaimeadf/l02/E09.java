package com.jaimeadf.l02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        if (saldo <= 200.0) {
            System.out.println("Nenhum crédito.");
        } else if (saldo <= 400.0) {
            System.out.println("R$" + 0.2 * saldo + "de crédito.");
        } else if (saldo <= 600.0) {
            System.out.println("R$" + 0.3 * saldo + "de crédito.");
        } else {
            System.out.println("R$" + 0.4 * saldo + "de crédito.");
        }
    }
}
