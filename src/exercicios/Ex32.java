package exercicios;

import java.util.Scanner;

public class Ex32 {

    //Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
    //Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
    //Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
    //outros dois lados.
    //a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    //b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("=== Digite tres valores === ");

        System.out.print("1° valor: ");
        a = scanner.nextInt();

        System.out.print("2° valor: ");
        b = scanner.nextInt();

        System.out.print("3° valor: ");
        c = scanner.nextInt();

            if((a+b) > c && (a+c) > b && (b+c) > a){
                System.out.print("Os 3 lados formam um triangulo!");
                if(a == b && a == c){
                    System.out.print("Equilatero");
                } else if(a == b || a == c || b == c) {
                    System.out.print("Isosceles");
                } else {
                    System.out.print("Escaleno");
                }
            } else {
                System.out.print("Os 3 lados NAO formam um trinagulo!");
            }

        }
    }
