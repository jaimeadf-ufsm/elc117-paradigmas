package com.jaimeadf.l02;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        double preco = 0.0;
        if (codigo == 1001) {
            preco = 5.32;
        } else if (codigo == 1324) {
            preco = 6.45;
        } else if (codigo == 6548) {
            preco = 2.37;
        } else if (codigo == 987) {
            preco = 5.32;
        } else if (codigo == 7623) {
            preco = 6.45;
        } else {
            System.out.println("Código inválido.");
            return;
        }

        double total = quantidade * preco;

        System.out.println("Você está devendo " + total + " fiado.");
    }
}
