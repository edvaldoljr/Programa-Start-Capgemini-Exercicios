package exercicios;

import java.util.Scanner;

public class Ex30 {

    //Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("=== Exercício 30 ===");
        System.out.println("");

        System.out.print("Digite o primeiro numero:");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero:");
        num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero:");
        num3 = scanner.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.println( num3 + "," + num2 + "," + num1);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println(num3 + "," + num1 + ","+ num2 );
        } else if (num3 > num2 && num2 >  num1) {
            System.out.println(num1 + "," + num2 + "," + num3);
        } else if (num3 > num1 && num2 > num3) {
            System.out.println(num1  + "," + num3 + "," + num2);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println(num2  + "," + num3 + "," + num1);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num2 + "," + num1 + "," + num3);
        } else {
            System.out.println(num1 + "," + num2 + "," + num3);
        }
    }
}
