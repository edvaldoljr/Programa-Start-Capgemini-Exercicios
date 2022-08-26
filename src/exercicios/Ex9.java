package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {

    // Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
    //mês.Considere fixo o juro da poupança em 0,07% a. m;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorDepositado = 0.0d;
        double rendementoMensal = 0.0d;
        float juros = 0.07f;
        DecimalFormat numeroFormatado = new DecimalFormat("####.##");

        System.out.println("=== Exercício 09 ===");

        System.out.println("Qual valor a ser depositado? ");
        valorDepositado = scanner.nextDouble();

        rendementoMensal = valorDepositado + (valorDepositado * juros);

        System.out.println("Valor com rendimento após 1 mes: " + numeroFormatado.format(rendementoMensal));
    }
}
