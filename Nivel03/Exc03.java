package Nivel03;

public class Exc03 {

}

public class LivroDigital extends Livro {
    private double tamanhoArquivoMB;

    public LivroDigital(String titulo, String autor, int quantidadeDisponivel, double tamanhoArquivoMB) {
        super(titulo, autor, quantidadeDisponivel);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    // Sobrescrita (Polimorfismo)
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Garante que título, autor e estoque apareçam
        System.out.println("Tipo: Livro Digital (E-book)");
        System.out.println("Tamanho do arquivo: " + this.tamanhoArquivoMB + " MB");
    }

    public double getTamanhoArquivoMB() { return tamanhoArquivoMB; }
    public void setTamanhoArquivoMB(double tamanhoArquivoMB) { this.tamanhoArquivoMB = tamanhoArquivoMB; }
}
