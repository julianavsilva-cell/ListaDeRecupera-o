package Nivel03;

public class Exc04 {

}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CADASTRO DE LIVROS ===\n");

        // Criando um livro físico
        LivroFisico livro1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 2, "Corredor B, Estante 4");
        
        // Criando um livro digital
        LivroDigital livro2 = new LivroDigital("Java: Como Programar", "Deitel", 5, 45.2);

        // Testando a exibição de informações (Polimorfismo em ação!)
        livro1.exibirInfo();
        System.out.println("-----------------------------------");
        livro2.exibirInfo();
        System.out.println("-----------------------------------\n");

        System.out.println("=== TESTE DE EMPRÉSTIMO ===");
        // Testando o método herdado 'emprestar'
        System.out.println("Quantidade antes do empréstimo: " + livro1.getQuantidadeDisponivel());
        livro1.emprestar();
        System.out.println("Quantidade depois do empréstimo: " + livro1.getQuantidadeDisponivel());
    }
}
