package Nivel01;

public class Exc01 {

	import java.util.Scanner;

	public class ExerciciosLogica {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o valor de A: ");
	        int a = input.nextInt();
	        System.out.print("Digite o valor de B: ");
	        int b = input.nextInt();

	        int c;

	        // Se forem iguais, soma; caso contrário, multiplica
	        if (a == b) {
	            c = a + b;
	        } else {
	            c = a * b;
	        }

	        System.out.println("O resultado de C é: " + c);

	        // Verifica se é par ou ímpar
	        if (c % 2 == 0) {
	            System.out.println("C é um número PAR.");
	        } else {
	            System.out.println("C é um número ÍMPAR.");
	        }

	        // Verifica se é positivo, negativo ou zero
	        if (c > 0) {
	            System.out.println("C é um número POSITIVO.");
	        } else if (c < 0) {
	            System.out.println("C é um número NEGATIVO.");
	        } else {
	            System.out.println("C é ZERO (neutro).");
	        }
	        
	        input.close();
	    }
	}

}
