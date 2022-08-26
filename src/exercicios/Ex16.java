package exercicios;

import java.util.Scanner;

public class Ex16 {

    // Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
    //sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
    //Recuperação (media entre 5.1 a 6.9);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float media = 0.0f;

        System.out.println("=== Exercicio 16 ===");
        System.out.println("");

        System.out.println("Digite o nome do aluno: ");
        nomeAluno = scanner.nextLine();

        System.out.println("Digite a primeira nota");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println(nomeAluno + " Aprovado");
        } else if (media <= 5) {
            System.out.println(nomeAluno + " Reprovado");
        } else if (media >= 5.1 && media <= 6.9){
            System.out.println(nomeAluno + " Recupeação");
        }
    }
}
