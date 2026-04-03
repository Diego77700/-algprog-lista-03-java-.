import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, ^): ");
        operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case '^':
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Erro: símbolo de operação inválido.");
        }

        scanner.close();
    }
}