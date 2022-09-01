package exercicios;

import java.util.Scanner;

public class Ex33 {

    //A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
    //calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
    //a. Professor Nível 1 R$12,00 por hora/aula;
    //b. Professor Nível 2 R$17,00 por hora/aula;
    //c. Professor Nível 3 R$25,00 por hora/aula.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeProfessor;
        float horasTrabalhadas = 0.0F;
        int nivel = 0;
        int nivel1 = 12;
        int nivel2 = 17;
        int nivel3 = 25;

        System.out.println("=== Escola Aprender ===\n");

        System.out.println("Digite o nome do professorº");
        nomeProfessor = scanner.next();

        System.out.println("Digite quanas horas foram trabalhadas no mês? ");
        horasTrabalhadas = scanner.nextFloat();

        System.out.println("Qual o nivel do professor digite a opção: ");
        System.out.println( "[1] -  Nivel 1 | [2] - Nivel 2 | [3] Nivel 3");
        nivel = scanner.nextInt();

        switch (nivel) {

            case 1 -> System.out.println("Professor: " + nomeProfessor + "\nSalario R$: " + (horasTrabalhadas * nivel1));
            case 2 -> System.out.println("Professor: " + nomeProfessor + "\nSalario R$: " + (horasTrabalhadas * nivel2));
            case 3 -> System.out.println("Professor: " + nomeProfessor + "\nSalario R$: " + (horasTrabalhadas * nivel3));
        }

    }
}
