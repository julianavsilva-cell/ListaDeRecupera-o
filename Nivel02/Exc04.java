package Nivel02;

public class Exc04 {

}

import java.util.Scanner;
import java.util.Random;

public class DesafioNumeroSecreto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        
        // Gera um número aleatório entre 0 e 99
        int numeroSecreto = rnd.nextInt(100);
        int palpite;
        int tentativas = 0;

        System.out.println("=== JOGO DO NÚMERO SECRETO ===");
        System.out.println("Tente adivinhar o número entre 0 e 99!");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();
            tentativas++; // Conta as tentativas

            if (palpite == numeroSecreto) {
                System.out.println("\n🎉 PARABÉNS! Você acertou em " + tentativas + " tentativas.");
                break; // Quebra o laço e encerra o programa
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR.");
            } else {
                System.out.println("O número secreto é MENOR.");
            }
        }

        input.close();
    }
}
