package com.jaimeadf.l03;

import java.util.ArrayList;
import java.util.Scanner;

record Aluno(int serie, int livros, boolean redacao) {}

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        while (true) {
            System.out.println("Aluno:");

            System.out.print("Digite a série (-1 para sair): ");
            int serie = scanner.nextInt();

            if (serie < 0) {
                break;
            }

            System.out.print("Digite a quantidade de livros lidos: ");
            int livros = scanner.nextInt();

            System.out.print("Gosta de redação (1 para sim, 0 para não): ");
            boolean redacao = scanner.nextBoolean();

            alunos.add(new Aluno(serie, livros, redacao));
        }

        System.out.println("Quantidade de alunos na terceira série: " + contarAlunosTerceiraSerie(alunos));
        System.out.println("A maior quantidade de livros lidos na quarta série: " + encontrarMaiorQuantidadeDeLivrosLidosNaQuartaSerie(alunos));
        System.out.println("A porcentagem de alunos que não gostam de fazer redaçao e que estão na terceira série: " + computarRazaoAlunosQueNaoGostamDeRedacaoNaTerceiraSerie(alunos));


    }

    private static int contarAlunosTerceiraSerie(ArrayList<Aluno> alunos) {
        int contador = 0;

        for (Aluno aluno : alunos) {
            if (aluno.serie() == 3) {
                contador++;
            }
        }

        return contador;
    }

    private static int encontrarMaiorQuantidadeDeLivrosLidosNaQuartaSerie(ArrayList<Aluno> alunos) {
        int livros = 0;

        for (Aluno aluno : alunos) {
            if (aluno.serie() == 4) {
                livros = Math.max(livros, aluno.livros());
            }
        }

        return livros;
    }

    private static int computarRazaoAlunosQueNaoGostamDeRedacaoNaTerceiraSerie(ArrayList<Aluno> alunos) {
        int contador = 0;

        for (Aluno aluno : alunos) {
            if (aluno.serie() == 3 && !aluno.redacao()) {
                contador++;
            }
        }

        return contador / alunos.size();
    }


}
