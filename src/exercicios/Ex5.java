package exercicios;

import java.util.Scanner;

public class Ex5 {

    //Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
    //No finalinformar o nome do aluno e a sua média (aritmética);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int nota1, nota2, nota3 = 0;
        int media = 0;

        System.out.println("Digite o Nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite a nota 2: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite a nota 3: ");
        nota3 = scanner.nextInt();

        media = ((nota1 + nota2 + nota3) / 3);
        System.out.println("Média: " + media);
    }
}