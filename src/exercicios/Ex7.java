package exercicios;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int celsios = 0;
        int fahrenheit = 0;

        System.out.println("Digite a temperatura em graus Celsios: ");
        celsios = scanner.nextInt();

        fahrenheit = (9 * celsios + 160)/5;

        System.out.println("Temperatura convertida para graus Fahrenheit: " + fahrenheit + "graus");
    }
}
