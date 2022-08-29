package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

    // A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
    //um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
    //desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
    //sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
    //Informar total de carros com ano até 2000 e total geral;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat numeroFormatado = new DecimalFormat("##.##");


        double valorVeiculo = 0.0D;
        double valorDescono = 0.0D;
        double valorPagoCliene = 0.0D;
        int anoVeiculo = 0;
        int carroAntigos = 0;
        int totalGeral = 0;
        char continuar = 'S';

        System.out.println("=== Exercício 20 ===");

        System.out.println("");

        System.out.println("=== Concessonária CARANGO VELHO ===");


        while (continuar == 'S' || continuar == 's') {


            System.out.println("");
            System.out.println("Qual valor do veiculo R$: ");
            valorVeiculo = scanner.nextDouble();

            System.out.println("Digite o ano do veiculo");
            anoVeiculo = scanner.nextInt();

            if (anoVeiculo <= 2000) {

                carroAntigos++;
                valorDescono = valorVeiculo * 0.12;
                valorPagoCliene = valorVeiculo - valorDescono;
                System.out.println("Valor a ser pago com Desconto de 12% R$: " + numeroFormatado.format(valorPagoCliene));

            } else if (anoVeiculo > 2000) {

                valorDescono = valorVeiculo * 0.07;
                valorPagoCliene = valorVeiculo - valorDescono;
                System.out.println("Valor a ser pago com Desconto de 7% R$: " + numeroFormatado.format(valorPagoCliene));
            }

            System.out.println("");
            totalGeral++;
            System.out.println("Deseja continuar [S] | [N] ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Total de carros com ano até 2000: " + carroAntigos);
        System.out.println("Total geral de carrros: " + totalGeral);
    }
}