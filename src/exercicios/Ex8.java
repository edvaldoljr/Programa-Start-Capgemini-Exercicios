package exercicios;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float reais = 0.0f;
        float dolar = 0.0f;
        float cotacao = 0.0f;

        System.out.println("===== Cotação do Dólar =====");
        System.out.println("Qual a cotação do atual do dólar? ");
        cotacao = scanner.nextFloat();

        System.out.println("Quantos dólares você possui? ");
        dolar = scanner.nextFloat();

        reais = dolar / cotacao;

        System.out.println(dolar + " Dólares equivalem á R$: " + reais);
    }
}
