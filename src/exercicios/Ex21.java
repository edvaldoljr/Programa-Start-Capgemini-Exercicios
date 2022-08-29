package exercicios;

import java.util.Scanner;

public class Ex21 {

    // Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
    // ou não para cumprir o serviço militar obrigatório. Informe os totais;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        char sexo;
        int idade = 0;
        char saude;
        char desejaConinuar = 'S';
        int totalAlistamento = 0;
        boolean apto;

        System.out.println("=== Exercício 21 ===");
        System.out.println("");
        System.out.println("=== Serviço militar obrigatório ===");
        System.out.println("");

        while ( desejaConinuar == 'S' || desejaConinuar == 's') {

            System.out.println("");

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Sexo [M] / [F]: ");
            sexo = scanner.next().charAt(0);

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.print("Saúde BOA - [B] / RUIM - [R]");
            saude = scanner.next().charAt(0);

            if ( idade >= 18 && saude == 'B' || saude == 'b'){
                apto = true;
                System.out.println("Apto a Serviço militar: " + apto);
            } else {
                apto = false;
                System.out.println("Apto a Serviço militar: " + apto);
            }

            totalAlistamento++;

            System.out.println("Deseja continuar [S] | [N] ");
            desejaConinuar = scanner.next().charAt(0);
        }
        System.out.println("Total de alistamentos: " + totalAlistamento);
    }
}
