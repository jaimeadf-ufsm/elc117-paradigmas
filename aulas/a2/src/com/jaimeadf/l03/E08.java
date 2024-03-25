package com.jaimeadf.l03;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    public int id;
    public double valor;
    public double aumento;

    public Produto(int id, double valor, double aumento) {
        this.id = id;
        this.valor = valor;
        this.aumento = aumento;
    }

    public double computarValorReajustado() {
        return valor * (1.0 + aumento);
    }
}

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("Produto");

            System.out.print("Digite o ID: ");
            int id = scanner.nextInt();

            if (id == 0) {
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            System.out.print("Digite o percentual de aumento: ");
            double porcentagemDeAumento = scanner.nextDouble();

            produtos.add(new Produto(id, valor, porcentagemDeAumento / 100.0));

            System.out.println();
        }

        for (Produto produto : produtos) {
            System.out.println("Produto " + produto.id + ": R$ " + produto.computarValorReajustado());
        }

        System.out.println();
        System.out.println("Quantidade de produtos mais caros que R$ 100,00 (após aumento): " + contarProdutosMaisCarosQue100(produtos));
        System.out.println("Média do valor dos produtos que não sofreram aumento: " + computarMediaDosProdutosQueNaoSofreramAumento(produtos));
        System.out.println("O valor do produto mais caro: " + encontrarValorDoProdutoMaisCaro(produtos));
    }

    private static int contarProdutosMaisCarosQue100(ArrayList<Produto> produtos) {
        int contador = 0;

        for (Produto produto : produtos) {
            if (produto.computarValorReajustado() > 100.0) {
                contador++;
            }
        }

        return contador;
    }

    private static double computarMediaDosProdutosQueNaoSofreramAumento(ArrayList<Produto> produtos) {
        double soma = 0;
        int contador = 0;

        for (Produto produto : produtos) {
            if (produto.aumento == 0.0) {
                soma += produto.valor;
                contador++;
            }
        }

        return soma / contador;
    }

    private static double encontrarValorDoProdutoMaisCaro(ArrayList<Produto> produtos) {
        double valor = 0;

        for (Produto produto : produtos) {
            if (produto.computarValorReajustado() > valor) {
                valor = produto.computarValorReajustado();
            }
        }

        return valor;
    }
}
