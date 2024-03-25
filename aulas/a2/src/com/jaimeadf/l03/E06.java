package com.jaimeadf.l03;

import java.util.ArrayList;
import java.util.Scanner;

record Resposta(int idade, int identificador, int opiniao)

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resposta> respostas = new ArrayList<Resposta>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Resposta " + i);
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite o identificador: ");
            int identificador = scanner.nextInt();
            System.out.println("Digite a opiniao: ");
            int opiniao = scanner.nextInt();

            respostas.add(new Resposta(idade, identificador, opiniao));
        }

        System.out.println("Quantidade de respostas 10: " + contarOpinioes10(respostas));
        System.out.println("Média de idade das pessoas que responderam o questionário: " + calcularMediaIdade(respostas));
        System.out.println("Porcentagem de pessoas que responderam 5 ou menos para a opinião da peça: " + calcularRazaoOpinioesNegativas(respostas) * 100.0);
        System.out.println("O identificador da pessoa mais velha: " + encontrarIdentificadorMaisVelho(respostas));
    }

    private static int contarOpinioes10(ArrayList<Resposta> respostas) {
        int contador = 0;

        for (Resposta resposta : respostas) {
            if (resposta.idade() == 10) {
                contador++;
            }
        }

        return contador;
    }

    private static double calcularMediaIdade(ArrayList<Resposta> respostas) {
        int soma = 0;

        for (Resposta resposta : respostas) {
            soma += resposta.idade();
        }

        return (double)soma / respostas.size();
    }

    private static double calcularRazaoOpinioesNegativas(ArrayList<Resposta> respostas) {
        int contador = 0;

        for (Resposta resposta : respostas) {
            if (resposta.opiniao() <= 5) {
                contador++;
            }
        }

        return (double)contador / respostas.size();
    }

    private static int encontrarIdentificadorMaisVelho(ArrayList<Resposta> respostas) {
        int idadeMaisVelha = respostas.getFirst().idade();
        int identificadorMaisVelho = respostas.getFirst().identificador();

        for (Resposta resposta : respostas) {
            if (idadeMaisVelha < resposta.idade()) {
                idadeMaisVelha = resposta.idade();
                identificadorMaisVelho = resposta.identificador();
            }
        }

        return identificadorMaisVelho;
    }
}
