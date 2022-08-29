package exercicios;

import java.util.Scanner;

public class Ex19 {

    //  Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
    //mulher. No final informe total de homens e de mulheres;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String sexo;
        int homem = 0;
        int mulher = 0;

        int i = 0;

        for (; i < 3 ; i++) {

            System.out.println("Digite o " + (i+1) + "° nome: ");
            nome = scanner.nextLine();

            System.out.println("Qual o sexo: [M] - Masculino | [F] - Feminino ");
            sexo = scanner.nextLine();

            switch (sexo) {
                case "M" -> System.out.println(nome + ": HOMEM" + (homem++));
                case "F" -> System.out.println(nome + ": MULHER" + (mulher++));
                default -> System.out.println("Sexo invalido");
            }
        }
        System.out.println("Total de MULHERES: " + mulher);
        System.out.println("Total de HOMENS: " + homem);
    }
}