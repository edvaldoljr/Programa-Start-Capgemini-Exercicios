package exercicios;

import java.util.Scanner;

public class Ex14 {

    //Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("=== Exercicio 14 ===");
        System.out.println("");

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = scanner.nextInt();

        System.out.println((numero1 > numero2) ? numero1 + " Maior" : + numero2 + " Maior");
    }
}
