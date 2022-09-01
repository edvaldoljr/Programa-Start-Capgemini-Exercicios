package exercicios;

import java.util.Scanner;

public class Ex28 {

    // Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
    //com os seguintes critérios:
    //a. 50% para aqueles que ganham menos do que três salários mínimos;
    //b. 20% para aqueles que ganham entre três até dez salários mínimos;
    //c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    //d. 10% para os demais funcionários.

    // Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
    //reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
    //vai aumentar sua folha de pagamento;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        double salarioFuncionario = 0.0d;
        double valorSalarioMinimo = 0.0d;
        double novoSalario = 0.0d;
        double reajuste = 0.0d;
        double aumentoFolhaPagamento = 0.0d;

        for (int i = 0 ; i < 584 ; i++) {

            System.out.print("Digie o nome do funcionario:  ");
            nome = scanner.next();

            System.out.print("Digite o salario do funcionario: ");
            salarioFuncionario = scanner.nextFloat();

            System.out.print("Digite qual valor do salário mínimo: ");
            valorSalarioMinimo = scanner.nextFloat();

            if (salarioFuncionario < valorSalarioMinimo * 3) {
                reajuste = (salarioFuncionario * 0.50);
                novoSalario = salarioFuncionario + reajuste;
                aumentoFolhaPagamento = aumentoFolhaPagamento + reajuste;
                System.out.println("Nome: " + nome + ".\n" + "Reajuste novo salário: " + novoSalario);

            } else if (salarioFuncionario > valorSalarioMinimo * 3 || salarioFuncionario < valorSalarioMinimo * 10) {
                reajuste = (salarioFuncionario * 0.20);
                novoSalario = salarioFuncionario + reajuste;
                aumentoFolhaPagamento = aumentoFolhaPagamento + reajuste;
                System.out.println("Nome: " + nome + ".\n" + "Reajuste novo salário: " + novoSalario);

            } else if (salarioFuncionario > valorSalarioMinimo * 11 || salarioFuncionario < valorSalarioMinimo * 20) {
                reajuste = (salarioFuncionario * 0.15);
                novoSalario = salarioFuncionario + reajuste;
                aumentoFolhaPagamento = aumentoFolhaPagamento + reajuste;
                System.out.println("Nome: " + nome + ".\n" + "Reajuste novo salário: " + novoSalario);
            } else {
                reajuste = (salarioFuncionario * 0.10);
                novoSalario = salarioFuncionario + reajuste;
                aumentoFolhaPagamento = aumentoFolhaPagamento + reajuste;
                System.out.println("Nome: " + nome + ".\n" + "Reajuste novo salário: " + novoSalario);
            }
        }
        System.out.println("Aumento na folha de pagamento da empresa R$: " + aumentoFolhaPagamento);
    }
}
