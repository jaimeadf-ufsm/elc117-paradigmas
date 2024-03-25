package com.jaimeadf.l03;

import java.util.Scanner;

class Funcionario {
    public int codigo;
    public int horasTrabalhadas;
    public int dependentes;

    public Funcionario(int codigo, int horasTrabalhadas, int dependentes) {
        this.codigo = codigo;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dependentes = dependentes;
    }

    public double salarioLiquido() {
        return salarioBruto() - inss() - ir();
    }

    public double inss() {
        return 0.085 * salarioBruto();
    }

    public double ir() {
        return 0.05 * salarioBruto();
    }

    public double salarioBruto() {
        return 12.0 * horasTrabalhadas + 40.0 * dependentes;
    }

    @Override
    public String toString() {
        String texto = "";

        texto += "Funcionário:\n";
        texto += "Código: " + codigo + "\n";
        texto += "IR: " + ir() + "\n";
        texto += "INSS: " + inss() + "\n";
        texto += "Salário líquido: " + salarioLiquido() + "\n";

        return texto;
    }
}
public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Funcionario " + i);

            System.out.print("Digite o codigo: ");
            int codigo = scanner.nextInt();

            System.out.print("Digite o numero de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            System.out.print("Digite o numero de dependentes: ");
            int dependentes = scanner.nextInt();

            Funcionario funcionario = new Funcionario(codigo, horasTrabalhadas, dependentes);

            System.out.println();
            System.out.println(funcionario);
        }
    }
}
