package Nivel03;

public class Exc01 {

}

public class Livro {
    // Atributos (privados para garantir o encapsulamento)
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    // Construtor: Inicializa o objeto com os dados obrigatórios
    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // Método para emprestar um livro
    public void emprestar() {
        if (this.quantidadeDisponivel > 0) {
            this.quantidadeDisponivel--;
            System.out.println("O livro \"" + this.titulo + "\" foi emprestado com sucesso!");
        } else {
            System.out.println("Desculpe, o livro \"" + this.titulo + "\" não está disponível no momento.");
        }
    }

    // Método para exibir informações básicas
    public void exibirInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponível em estoque: " + this.quantidadeDisponivel);
    }

    // Getters e Setters (permitem acessar e modificar os atributos com segurança)
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getQuantidadeDisponivel() { return quantidadeDisponivel; }
    public void setQuantidadeDisponivel(int quantidadeDisponivel) { this.quantidadeDisponivel = quantidadeDisponivel; }
}
