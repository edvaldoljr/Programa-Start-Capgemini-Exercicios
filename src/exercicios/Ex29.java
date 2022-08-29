package exercicios;

import java.util.Scanner;

public class Ex29 {

    //Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("=== Exercicio 29 ===");
        System.out.println("");
        System.out.print("Digite um número correspondente ao algum mes do ano: ");
        numero = scanner.nextInt();

        switch (numero) {
            case 1 -> System.out.println("JANEIRO");
            case 2 -> System.out.println("FEVEREIRO");
            case 3 -> System.out.println("MARÇO");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAIO");
            case 6 -> System.out.println("JUNHO");
            case 7 -> System.out.println("JULHO");
            case 8 -> System.out.println("AGOSTO");
            case 9 -> System.out.println("SETEMBRO");
            case 10 -> System.out.println("OUTUBRO");
            case 11 -> System.out.println("NOVEMBRO");
            case 12 -> System.out.println("DEZEMBRO");
            default -> System.out.println("Número invalido");
        }
    }
}
