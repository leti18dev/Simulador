public class Arquivo {
    private String nome;
    private int tamanho;
    private int blocoInicial; // para contígua
    // para encadeada: lista de blocos
    // para indexada: bloco de índice

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.blocoInicial = -1;
    }

    public String getNome() { return nome; }
    public int getTamanho() { return tamanho; }
    public int getBlocoInicial() { return blocoInicial; }
    public void setBlocoInicial(int pos) { this.blocoInicial = pos; }
}
