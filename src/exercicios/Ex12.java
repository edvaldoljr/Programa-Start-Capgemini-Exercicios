package exercicios;

import java.util.Scanner;

public class Ex12 {

    //O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
    //dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
    //do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
    //45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
    //mesmo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        float custoCarro = 0.0f;
        float custoDeFabrica = 0.0f;
        float percentualDoDistribuidor = 0.28f;
        float impostos = 0.45f;

        System.out.println("Qual o custo de fabrica do carro? ");
        custoDeFabrica = scanner.nextFloat();

        impostos = (custoDeFabrica * impostos);
        custoDeFabrica = (custoDeFabrica + impostos);
        percentualDoDistribuidor = (custoDeFabrica * percentualDoDistribuidor);
        custoCarro = (custoDeFabrica + percentualDoDistribuidor);

        System.out.println("Aplicando impostos e percentual do distribuidor, o preço deste veículo será de R$: " + custoCarro);
    }
}
