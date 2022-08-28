package exercicios;

import java.util.Scanner;

public class Ex18 {

    // Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
    //“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        int i = 0;

        System.out.println("=== Exercicio 18 ===");

        for (; i < 75 ; i++) {

            System.out.print("Digite a " + (i+1) + "° idade: ");
            idade = scanner.nextInt();

            System.out.println((idade >= 18 ? "Maior de idade" : "Menor de idade"));
        }
    }
}
