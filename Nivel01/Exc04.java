package Nivel01;

public class Exc04 {

}

import java.util.Scanner;

public class TrocaVariaveis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da variável A: ");
        String a = input.next(); // Usando String para aceitar qualquer tipo de dado de entrada
        System.out.print("Digite o valor da variável B: ");
        String b = input.next();

        System.out.println("\n--- Antes da troca ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Lógica de inversão usando uma variável auxiliar
        String aux = a;
        a = b;
        b = aux;

        System.out.println("\n--- Após a troca ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        input.close();
    }
}
