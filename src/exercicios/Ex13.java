package exercicios;

import java.util.Scanner;

public class Ex13 {

    // Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int numero = 0;

        System.out.println("=== Exercicio 12 ===");
        System.out.println("");

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println((numero > 10) ? "Maior que 10" : "");
    }
}