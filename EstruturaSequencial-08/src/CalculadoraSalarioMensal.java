import java.util.Scanner;

public class CalculadoraSalarioMensal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o valor do salário por hora
        System.out.print("Digite o valor do salário por hora: ");
        double valorHora = scanner.nextDouble(); // Lê o valor do salário por hora digitado pelo usuário

        // Solicitar ao usuário que insira o número de horas trabalhadas no mês
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble(); // Lê o número de horas trabalhadas no mês digitado pelo usuário

        // Calcular o salário mensal
        double salarioMensal = valorHora * horasTrabalhadas; // Fórmula do salário mensal: valorHora * horasTrabalhadas

        // Exibir o total do salário mensal
        System.out.println("O total do salário mensal é: " + salarioMensal);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
