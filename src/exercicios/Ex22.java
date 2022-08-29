package exercicios;

import java.util.Scanner;

public class Ex22 {

    // Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
    //se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
    //de venda de cada produto, amédia de preço de custo e do preço de venda;

    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0F;
        float totaolVenda = 0.0F;

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        for (; i <3 ; i++) {

            System.out.print("Digite o nome do produto: ");
            nomeProduto = scanner.nextLine();

            System.out.print("Digite o preço de custo: ");
            precoCusto = scanner.nextFloat();

            System.out.print("Digite o preço de venda: ");
            precoVenda = scanner.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totaolVenda = totaolVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve empate entre os preços! ");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Prejuizo");
                } else {
                    System.out.println("Lucro");
                }
            }

            System.out.println(nomeProduto + "Preço de custo: " + precoCusto + ", Preço de venda: " + precoVenda);
            System.out.println("");
        }

        System.out.println("A média do preço de custo é: " + (totalCusto / i));
        System.out.println("A média do preço de venda é: " + (totaolVenda / i));
    }
}
