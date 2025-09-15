public class Disco {
    private int tamanho;
    private String[] blocos;

    public Disco(int tamanho) {
        this.tamanho = tamanho;
        this.blocos = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            blocos[i] = "L"; // Livre
        }
    }

    public String[] getBlocos() { return blocos; }
    public int getTamanho() { return tamanho; }

    public void ocuparBloco(int pos, String idArquivo) {
        blocos[pos] = idArquivo;
    }

    public void liberarBloco(int pos) {
        blocos[pos] = "L";
    }

    public void mostrarDisco() {
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%02d[%s] ", i, blocos[i]);
            if ((i+1) % 10 == 0) System.out.println();
        }
    }
}
