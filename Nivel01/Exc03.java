package Nivel01;

public class Exc03 {

}

import java.util.Scanner;

public class CondicaoPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorOriginal = input.nextDouble();

        System.out.println("\n--- Formas de Pagamento ---");
        System.out.println("1: À vista em dinheiro/Pix (15% de desconto)");
        System.out.println("2: À vista no cartão de crédito (10% de desconto)");
        System.out.println("3: Parcelado em 2x (preço normal)");
        System.out.println("4: Parcelado em 3x ou mais (10% de juros)");
        System.out.print("Escolha o código de pagamento (1 a 4): ");
        int codigo = input.nextInt();

        double valorFinal = valorOriginal;

        switch (codigo) {
            case 1:
                valorFinal = valorOriginal * 0.85; // 15% de desconto
                System.out.println("Aplicado: 15% de desconto.");
                break;
            case 2:
                valorFinal = valorOriginal * 0.90; // 10% de desconto
                System.out.println("Aplicado: 10% de desconto.");
                break;
            case 3:
                System.out.println("Aplicado: Parcelado em 2x sem juros.");
                System.out.printf("Serão 2 parcelas de: R$ %.2f%n", (valorFinal / 2));
                break;
            case 4:
                valorFinal = valorOriginal * 1.10; // 10% de juros
                System.out.println("Aplicado: 10% de juros.");
                break;
            default:
                System.out.println("Código inválido! Mantendo o valor original.");
                break;
        }

        System.out.printf("O valor final a ser pago é: R$ %.2f%n", valorFinal);
        input.close();
    }
}
