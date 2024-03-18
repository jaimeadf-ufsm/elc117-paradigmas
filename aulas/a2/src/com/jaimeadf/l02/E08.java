package com.jaimeadf.l02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poluicao = scanner.nextDouble();

        if (poluicao <= 0.29) {
            System.out.println("O nível da poluição está aceitável.");
        } else if (poluicao <= 0.3) {
            System.out.println("As atividades das indústrias do 1º grupo devem ser suspensas.");
        } else if (poluicao <= 0.4) {
            System.out.println("As atividades das indústrias do 1º e do 2º grupo devem ser suspensas.");
        } else {
            System.out.println("As atividades de todas as indústrias devem ser suspensas.");
        }
    }
}
