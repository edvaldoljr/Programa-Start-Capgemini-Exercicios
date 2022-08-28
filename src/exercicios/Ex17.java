package exercicios;

import java.util.Scanner;

public class Ex17 {

    // Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
    //(inclusive);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int totalDentroIntervalo = 0;
        int i = 0;

        System.out.println("=== Exercicio 17 ===");
        for (; i < 80 ; i++) {
            System.out.print("Digite o " + (i+1) +  "° numero: ");
            numero = scanner.nextInt();

            if (numero >= 10 && numero <= 150) {
                totalDentroIntervalo++;
            }
        }
        System.out.println("Total de números dentro do intervalor de 10 e 150: " + totalDentroIntervalo);
    }
}