import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();

       
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } 
        else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double x = -c / b;
            System.out.println("Raiz: " + x);
        } 
        else {
            
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } 
            else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double x = -b / (2 * a);
                System.out.println("Raiz: " + x);
            } 
            else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x2);
            }
        }

        scanner.close();
    }
}