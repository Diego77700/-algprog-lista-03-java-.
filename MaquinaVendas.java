import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra, valorPago;

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        valorPago = scanner.nextDouble();

        
        if (valorPago < valorCompra) {
            System.out.println("Quantia insuficiente para realizar a compra.");
        } else {
            int troco = (int)(valorPago - valorCompra);

            System.out.println("Troco: R$ " + troco);

            
            int n50 = troco / 50;
            troco = troco % 50;

            int n20 = troco / 20;
            troco = troco % 20;

            int n10 = troco / 10;
            troco = troco % 10;

            int n5 = troco / 5;
            troco = troco % 5;

            int n2 = troco / 2;
            troco = troco % 2;

            int n1 = troco;

            System.out.println("Notas de R$ 50,00: " + n50);
            System.out.println("Notas de R$ 20,00: " + n20);
            System.out.println("Notas de R$ 10,00: " + n10);
            System.out.println("Notas de R$ 5,00: " + n5);
            System.out.println("Notas de R$ 2,00: " + n2);
            System.out.println("Notas de R$ 1,00: " + n1);
        }

        scanner.close();
    }
}