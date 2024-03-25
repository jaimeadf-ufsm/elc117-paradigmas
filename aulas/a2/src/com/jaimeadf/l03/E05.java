package com.jaimeadf.l03;

import java.util.ArrayList;
import java.util.Scanner;

class Entrevistado {
    int idade;
    char sexo;
    int livros;

    public Entrevistado(int idade, char sexo, int livros) {
        this.idade = idade;
        this.sexo = sexo;
        this.livros = livros;
    }
}

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Entrevistado> entrevistados = new ArrayList<Entrevistado>();

        while (true) {
            int idade = scanner.nextInt();
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            int livros = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            entrevistados.add(new Entrevistado(idade, sexo, livros));
        }

        System.out.println("Total de livros lidos por menores de 10 anos: " + contarLivrosLidosPorMenoresDe10(entrevistados));
        System.out.println("Quantidade de mulheres que leram 5 livros ou mais: " + contarMulheresLeitoras(entrevistados));
        System.out.println("Média de idade de homens que leram menos que 5 livros: " + calcularMediaIdadeHomensQueLeramMenosDe5Livros(entrevistados));
        System.out.println("Percentual de pessoas que não leram livros: " + calcularRazaoDeNaoLeitores(entrevistados) * 100.0   );
    }

    private static int contarLivrosLidosPorMenoresDe10(ArrayList<Entrevistado> entrevistados) {
        int contador = 0;

        for (Entrevistado entrevistado : entrevistados) {
            if (entrevistado.idade < 10) {
                contador += entrevistado.livros;
            }
        }

        return contador;
    }

    private static int contarMulheresLeitoras(ArrayList<Entrevistado> entrevistados) {
        int contador = 0;

        for (Entrevistado entrevistado : entrevistados) {
            if (entrevistado.sexo == 'F' && entrevistado.livros >= 5) {
                contador++;
            }
        }

        return contador;
    }

    private static double calcularMediaIdadeHomensQueLeramMenosDe5Livros(ArrayList<Entrevistado> entrevistados) {
        int soma = 0;
        int contador = 0;

        for (Entrevistado entrevistado : entrevistados) {
            if (entrevistado.sexo == 'M' && entrevistado.livros < 5) {
                soma += entrevistado.idade;
                contador++;
            }
        }

        return (double)soma / contador;
    }

    private static double calcularRazaoDeNaoLeitores(ArrayList<Entrevistado> entrevistados) {
        int contador = 0;

        for (Entrevistado entrevistado : entrevistados) {
            if (entrevistado.livros == 0) {
                contador++;
            }
        }

        return (double)contador / entrevistados.size();
    }
}
