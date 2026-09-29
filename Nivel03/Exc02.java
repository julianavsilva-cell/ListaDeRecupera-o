package Nivel03;

public class Exc02 {

}

public class LivroFisico extends Livro {
    private String localizacaoPrateleira;

    // O construtor usa o 'super' para enviar os dados comuns para a classe mãe
    public LivroFisico(String titulo, String autor, int quantidadeDisponivel, String localizacaoPrateleira) {
        super(titulo, autor, quantidadeDisponivel);
        this.localizacaoPrateleira = localizacaoPrateleira;
    }

    // Sobrescrita (Polimorfismo): Modifica o comportamento do método exibirInfo
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe mãe primeiro
        System.out.println("Tipo: Livro Físico");
        System.out.println("Prateleira: " + this.localizacaoPrateleira);
    }

    public String getLocalizacaoPrateleira() { return localizacaoPrateleira; }
    public void setLocalizacaoPrateleira(String localizacaoPrateleira) { this.localizacaoPrateleira = localizacaoPrateleira; }
}
