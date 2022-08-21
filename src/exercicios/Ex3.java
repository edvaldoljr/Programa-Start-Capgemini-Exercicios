package exercicios;

import java.util.Scanner;

public class Ex3 {

    // Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
    //total percorrida pelo automóvel e o total de combustível gasto;

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        float consumoMedio, distanciaTotal, totalCombustivelGasto = 0.0f;

        System.out.println("Distancia total percorrida K:");
        distanciaTotal = scanner.nextFloat();

        System.out.println("Total de combustível gasto:");
        totalCombustivelGasto = scanner.nextFloat();

        consumoMedio = distanciaTotal / totalCombustivelGasto;

        System.out.println("Consumo Médio: " + consumoMedio + "Litros/KM");
    }
}
