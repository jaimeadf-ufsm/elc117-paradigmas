package com.jaimeadf.l01;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        double horas = scanner.nextDouble();
        double minutos = horas * 60.0;

        System.out.println(minutos + " minutos passaram até agora.");
    }
}
