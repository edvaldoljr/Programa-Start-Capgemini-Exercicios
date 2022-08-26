package exercicios;

import java.util.Scanner;

public class Ex10 {

    //A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
    //algoritmo que receba um valor de uma compra e mostre o valor das prestações;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorCompra =0.0d;
        double prestacao = 0.0d;

        System.out.println("=== Exercíco 10 ===");
        System.out.println("");

        System.out.println("Qual valor da compra? ");
        valorCompra = scanner.nextDouble();

        prestacao = valorCompra / 5;

        System.out.println("O valaor da compra de: " + valorCompra + " fica em 5 parcelas de R$: " + prestacao);
    }
}
