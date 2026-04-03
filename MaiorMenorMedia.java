import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;
        double maior, menor, media;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = scanner.nextDouble();

       
        maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        
        menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        
        media = (n1 + n2 + n3) / 3;

        // Exibir resultados
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        scanner.close();
    }
}