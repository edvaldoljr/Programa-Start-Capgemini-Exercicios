package exercicios;

import java.util.Scanner;

public class Ex27 {

    // A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
    //algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
    //calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
    //–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
    //clientes;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valorCarro;
        float desconto;
        float gasolina = 0.21f;
        float alcool = 0.25f;
        float diesel = 0.14f;
        int combustivel = 0;
        boolean continuar = true;

        System.out.println("=== Exercício 27 ===");
        System.out.println("");
        System.out.println("=== Concessionária de veículos CARANGO ===");

        while (continuar){
            System.out.print("Qual valor do veicúlo R$: ");
            valorCarro = scanner.nextFloat();

            if (valorCarro > 0) {
                System.out.println("Qual o tipo de combustivel do veicúlo:");
                System.out.println("[1] GASOLINA | [2] ALCOOL | [3] DIESEL");
                combustivel = scanner.nextInt();

                if (combustivel == 1){
                    continuar = true;
                    desconto = valorCarro * gasolina;
                    System.out.println("Valor do carro com descono de " + gasolina + "% é R$: " + (valorCarro - desconto) + " Descono de R$: " + desconto);
                } else {
                    if (combustivel == 2) {
                        continuar = true;
                        desconto = valorCarro * alcool;
                        System.out.println("Valor do carro com descono de " + alcool + "% é R$: " + (valorCarro - desconto) + " Descono de R$: " + desconto);
                    } else {
                        if (combustivel == 3) {
                            continuar = true;
                            desconto = valorCarro * diesel;
                            System.out.println("Valor do carro com descono de " + diesel + "% é R$: " + (valorCarro - desconto) + " Descono de R$: " + desconto);
                        }
                    }
                }
            } else {
                if (valorCarro == 0){
                    continuar = false;
                }
            }
        }
    }
}
