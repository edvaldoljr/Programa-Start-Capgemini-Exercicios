package exercicios;

import java.util.Scanner;

public class Ex23 {

    // Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
    //menor que 25 ou igual a 40;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("=== Exercício 23 ===");

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        if (numero < 25) {
            System.out.println("Numero menor que 25");
        } else {
            if (numero > 80) {
                System.out.println("Numero maior que 80");
            } else {
                if (numero == 40) {
                    System.out.println("Numero igual a 40");
                }
            }
        }
    }
}
