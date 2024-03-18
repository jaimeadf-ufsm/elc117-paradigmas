package com.jaimeadf.l01;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura e altura de um retângulo: ");
        double largura = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double perimetro = 2 * largura + 2 * altura;
        double area = largura * altura;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
