package exercicios;

import java.util.Scanner;

public class Ex4 {

    //Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
    //por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
    //efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

    public static void main(String[] args) {

        String nomeVendedor;
        double salarioFixo = 0.0d;
        double totalVendas = 0.0d;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = scanner.nextLine();

        System.out.println("Qual salário fixo doª: " + nomeVendedor);
        salarioFixo = scanner.nextDouble();

        System.out.println("Qual total de vendas do " + nomeVendedor + ":");
        totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Salário Fixo: " + salarioFixo);
        System.out.println("Sálario + Comissão: " + (comissao + salarioFixo));
    }
}