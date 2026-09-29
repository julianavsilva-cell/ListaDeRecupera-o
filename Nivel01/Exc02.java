package Nivel01;

public class Exc02 {

}

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu peso (kg): ");
        double peso = input.nextDouble();
        System.out.print("Digite a sua altura (m): ");
        double altura = input.nextDouble();

        // Fórmula: peso / (altura * altura)
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Classificação baseada na tabela padrão da OMS
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Classificação: Peso ideal (normal)");
        } else if (imc < 30.0) {
            System.out.println("Classificação: Levemente acima do peso (Sobrepeso)");
        } else if (imc < 35.0) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

        input.close();
    }
}
