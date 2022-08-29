package exercicios;

import java.util.Scanner;

public class Ex24 {

    // Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        char desejaConinuar = 'S';

        System.out.println("=== Exercício 24 ===");

        while (desejaConinuar == 'S' || desejaConinuar == 's') {

        System.out.println("Digite um numero");
        numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Zero");
            } else if (numero > 0) {
                System.out.println("POSIIVO");
            } else {
                System.out.println("NEGATIVO");
            }

            System.out.println("Deseja continuar [S] | [N] ");
            desejaConinuar = scanner.next().charAt(0);
        }
    }
}
