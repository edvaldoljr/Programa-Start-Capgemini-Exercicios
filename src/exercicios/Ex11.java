package exercicios;

import java.util.Scanner;

public class Ex11 {

    //Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
    //preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float precoCusto = 0.0f;
        float valorVenda = 0.0f;
        float percentualAcrescimo = 0.0f;

        System.out.println("=== Exercico 11 ===");
        System.out.println("");

        System.out.println("Qual o valor de custo do produto: ");
        precoCusto = scanner.nextFloat();

        System.out.println("Qual o percentual de acrescimo para o produto? ");
        percentualAcrescimo = scanner.nextFloat();


        valorVenda = precoCusto + (precoCusto * percentualAcrescimo);

        System.out.println("O valor de venda com ajuste de acrescimo fica em R$: " +  valorVenda);
    }
}
