package exercicios;

import java.util.Scanner;

public class Ex31 {

    // Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
    //resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
    //impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        char c;

        System.out.println("Digite um numero: ");
        a = scanner.nextInt();

        System.out.println("Digite a operação aritmetica:");
        c = scanner.next().charAt(0);

        System.out.println("Digite mais um número: ");
        b = scanner.nextInt();

        if (c == '+' || c == '-' || c == '*' || c == '/') {
            if ( c == '+') {
                System.out.println("SOMA: " + (a + b));
            } else if (c == '-') {
                System.out.println("SUBTRAÇÃO: " + (a - b));
            } else if (c == '*') {
                System.out.println("MULTIPLICAÇÃO: " + (a * b));
            } else if (c == '/') {
                if (b == 0) {
                    System.out.println("Proibido divisão por ZERO");
                } else {
                    System.out.println("DIVISÃO: " + (a / b));
                }
            }
        } else {
            System.out.println("Operador não definido");
        }
    }
}
