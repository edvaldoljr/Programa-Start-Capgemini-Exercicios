package exercicios;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        //Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
        // dos dois números lidos;

        float numero1 = 0.0f;
        float numero2 = 0.0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        numero1 = scanner.nextFloat();

        System.out.println("Digite um número");
        numero2 = scanner.nextFloat();

        System.out.println("Soma entre os números: " + (numero1 + numero2));
        System.out.println("Subtração entre os números: " + (numero1 - numero2));
        System.out.println("Multiplicação entre os números: " + (numero1 * numero2));
        System.out.println("Divisão entre os números: " + (numero1 / numero2));
    }
}
