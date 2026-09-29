package Nivel02;

public class Exc01 {

}


import java.util.Scanner;

public class Exercício1While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalGeral = 0;
        String continuar = "sim"; // Condição inicial para entrar no loop

        // O laço roda ENQUANTO a resposta for "sim"
        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Digite o preço do produto: R$ ");
            double preco = input.nextDouble();
            
            totalGeral = totalGeral + preco; // Acumula o valor

            System.out.print("Deseja adicionar mais um item? (sim/não): ");
            continuar = input.next(); // Atualiza a variável de controle
        }

        System.out.printf("Valor total final da compra: R$ %.2f%n", totalGeral);
        input.close();
    }
}
