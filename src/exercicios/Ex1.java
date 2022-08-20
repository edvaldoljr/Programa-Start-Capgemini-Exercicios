package exercicios;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        //Faça um algoritmo que leia dois números e exiba o resultado da soma;

        float numero1 = 0.0f;
        float numero2 = 0.0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        numero1 = scanner.nextFloat();

        System.out.println("Digite um número");
        numero2 = scanner.nextFloat();

        float soma = numero1 + numero2;

        System.out.println("Soma entre os números: " + soma);
    }
}
