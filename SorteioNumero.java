import java.util.Scanner;
import java.util.Random;

public class SorteioNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Gerar número aleatório no intervalo [menor, maior]
        int sorteado = random.nextInt((maior - menor) + 1) + menor;

        
        if (sorteado % 2 == 0) {
            System.out.println("Número sorteado: " + sorteado);
            System.out.println("O número é PAR.");
        } else {
            System.out.println("Número sorteado: " + sorteado);
            System.out.println("O número é ÍMPAR.");
        }

        scanner.close();
    }
}