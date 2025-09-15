public class Metricas {
    public static double fragmentacaoInterna(Disco disco, Arquivo arquivo) {
        int blocosOcupados = arquivo.getTamanho();
        int ultimoBloco = arquivo.getBlocoInicial() + blocosOcupados - 1;
        int totalReservado = (ultimoBloco - arquivo.getBlocoInicial() + 1);
        return (1 - ((double) blocosOcupados / totalReservado)) * 100;
    }

    public static int tempoLeitura(Arquivo arquivo, boolean aleatoria) {
        return aleatoria ? arquivo.getTamanho() * 30 : arquivo.getTamanho() * 10;
    }
}
