package com.jaimeadf.l01;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio de um círculo: ");
        double raio = scanner.nextDouble();

        double perimetro = 2.0 * Math.PI * raio;
        double area = Math.PI * raio * raio;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
