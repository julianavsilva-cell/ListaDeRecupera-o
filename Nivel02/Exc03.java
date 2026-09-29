package Nivel02;

public class Exc03 {

}

import java.util.Scanner;

public class Exercício2DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        int contador = 0;
        int maior = Integer.MIN_VALUE; // Inicializa com o menor número possível do Java

        do {
            System.out.print("Digite um número (ou -1 para parar): ");
            numero = input.nextInt();

            // Se o usuário digitou -1 de cara, não processa os dados
            if (numero != -1) {
                soma = soma + numero;
                contador = contador + 1; // Conta quantos números válidos foram digitados

                // Se o número atual for maior que o maior guardado, atualiza
                if (numero > maior) {
                    maior = numero;
                }
            }
        } while (numero != -1); // Condição de parada

        // Só mostra os resultados se o usuário digitou algum número válido antes de sair
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Soma total: " + soma);
            System.out.println("Média dos números: " + media);
            System.out.println("Maior número digitado: " + maior);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        
        input.close();
    }
}
