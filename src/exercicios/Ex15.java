package exercicios;

import java.util.Scanner;

public class Ex15 {

    // Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println((numero >= 100 && numero <= 200 ? "Está no intervalor entre 100 e 200" :  "Está fora do intervalor de 100 e 200"));
    }
}
