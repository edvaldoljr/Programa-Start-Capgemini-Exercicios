package exercicios;

import java.util.Scanner;

public class Ex26 {

    // Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
    //que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("=== Exercício 26 ===");
        System.out.println("");
        System.out.println("Digite um número de 1 a 5");
        numero = scanner.nextInt();

        switch (numero) {
            case 1 -> System.out.println("UM");
            case 2 -> System.out.println("DOIS");
            case 3 -> System.out.println("TRÊS");
            case 4 -> System.out.println("QUATRO");
            case 5 -> System.out.println("CINCO");
            default -> System.out.println("Número invalido");
        }
    }
}
