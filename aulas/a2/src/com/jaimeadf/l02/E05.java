package com.jaimeadf.l02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");

        int idade = scanner.nextInt();

        if (idade < 5) {
            System.out.println("Você não tem idade para ser nadador");
        } else if (idade <= 7) {
            System.out.println("Infantil A: 5 a 7 anos");
        } else if (idade <= 10) {
            System.out.println("Infantil B: 8 a 10 anos");
        } else if (idade <= 13) {
            System.out.println("Juvenil A: 11 a 13 anos");
        } else if (idade <= 17) {
            System.out.println("Juvenil B: 14 a 17 anos");
        } else {
            System.out.println("Sênior: maiores de 18 anos");
        }
    }
}
