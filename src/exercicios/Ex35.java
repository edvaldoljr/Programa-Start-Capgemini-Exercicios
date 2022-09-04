package exercicios;

import java.util.Scanner;

public class Ex35 {

    //Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
    //luz segue a tabela abaixo:
    //Tipo de Cliente Valor do KW/h
    //a. (Residência) 0,60;
    //b. (Comércio) 0,48;
    //c. (Indústria) 1,29.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int residencia;
        int kw;
        float consumo;


        System.out.println("[1] RESINDENCIA | [2] COMERCIO | [3] INDUSTRIA");
        System.out.print("INFORME O TIPO DE RESIDENCIA: ");

        residencia = scanner.nextInt();

        switch (residencia) {

            case 1 -> {
                System.out.print("Informe a quantidade de KW gastos no mês: ");
                kw = scanner.nextInt();
                consumo = (float) (kw * 0.60);
                System.out.println("Valor da conta de luz R$: " + consumo);
            }case 2 -> {
                System.out.print("Informe a quantidade de KW gastos no mês: ");
                kw = scanner.nextInt();
                consumo = (float) (kw * 0.48);
                System.out.println("Valor da conta de luz R$: " + consumo);
            }case 3 -> {
                System.out.print("Informe a quantidade de KW gastos no mês: ");
                kw = scanner.nextInt();
                consumo = (float) (kw * 1.29);
                System.out.println("Valor da conta de luz R$: " + consumo);
            }
            default -> System.out.println("OPÇÃO INVALIDA");
        }
    }
}
