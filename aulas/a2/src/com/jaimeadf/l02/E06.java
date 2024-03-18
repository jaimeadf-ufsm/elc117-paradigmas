package com.jaimeadf.l02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as duas notas:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.print("Digite quantas aulas foram assistidas:");
        int aulasAssistidas = scanner.nextInt();

        System.out.println("Digita quantas aulas foram ministradas:");
        int aulasMinistradas = scanner.nextInt();

        double media = (a + b) / 2.0;
        double presenca = (double)aulasAssistidas / aulasMinistradas;

        if (presenca >= 0.75 && media >= 6.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
