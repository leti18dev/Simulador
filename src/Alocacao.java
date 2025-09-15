public interface Alocacao {
    boolean criarArquivo(Disco disco, Arquivo arquivo);
    void deletarArquivo(Disco disco, Arquivo arquivo);
    void estenderArquivo(Disco disco, Arquivo arquivo, int novoTamanho);
    void lerArquivo(Disco disco, Arquivo arquivo, boolean aleatoria);
}
