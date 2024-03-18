package com.jaimeadf.l01;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        double novoSaldo = saldo * 1.01;

        System.out.println("Saldo reajusto em 1%: " + novoSaldo);
    }
}
