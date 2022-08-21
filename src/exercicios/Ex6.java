package exercicios;

import java.util.Scanner;

public class Ex6 {

    //Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
    //possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
    //trocados;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int aux;

        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextInt();

        System.out.println("Digite o segundovalor: ");
        b = scanner.nextInt();

        System.out.println("");

        System.out.println("Valor 1: " + a);
        System.out.println("Valor 2: " + b);

        System.out.println("");
        System.out.println("Trocando os valores");

        aux = a;
        a = b;
        b = aux;

        System.out.print("Valor 1: " + a);
        System.out.println();
        System.out.println("Valor 2: " + b);
    }
}
