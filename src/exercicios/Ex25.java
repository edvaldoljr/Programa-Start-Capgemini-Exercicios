package exercicios;

import java.util.Scanner;

public class Ex25 {

    //  Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
    //imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
    //maior, e uma mensagem que são diferentes;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("=== Exercício 25 ===");

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("'IGUAIS'");
        } else {
            if (numero1 > numero2){
                System.out.println("'DIFERENTES' | NUMERO MAIOR: " + numero1 );
            } else {
                System.out.println("'DIFERENTES' | NÚMERO MAIOR: " + numero2);
            }
        }
    }
}
