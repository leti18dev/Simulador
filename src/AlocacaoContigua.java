import java.util.Random;

public class AlocacaoContigua implements Alocacao {
    @Override
    public boolean criarArquivo(Disco disco, Arquivo arquivo) {
        String[] blocos = disco.getBlocos();
        int livresSeguidos = 0, inicio = -1;

        for (int i = 0; i < blocos.length; i++) {
            if (blocos[i].equals("L")) {
                if (livresSeguidos == 0) inicio = i;
                livresSeguidos++;
                if (livresSeguidos == arquivo.getTamanho()) {
                    for (int j = inicio; j < inicio + arquivo.getTamanho(); j++) {
                        disco.ocuparBloco(j, arquivo.getNome());
                    }
                    arquivo.setBlocoInicial(inicio);
                    return true;
                }
            } else {
                livresSeguidos = 0;
            }
        }
        return false; // não encontrou espaço contíguo
    }

    @Override
    public void deletarArquivo(Disco disco, Arquivo arquivo) {
        for (int i = 0; i < disco.getTamanho(); i++) {
            if (disco.getBlocos()[i].equals(arquivo.getNome())) {
                disco.liberarBloco(i);
            }
        }
    }

    @Override
    public void estenderArquivo(Disco disco, Arquivo arquivo, int novoTamanho) {
        // pode realocar ou falhar dependendo da fragmentação
    }

    @Override
    public void lerArquivo(Disco disco, Arquivo arquivo, boolean aleatoria) {
        int inicio = arquivo.getBlocoInicial();
        if (inicio == -1) return;

        int fim = inicio + arquivo.getTamanho();

        if (aleatoria) {
            Random rand = new Random();
            System.out.println("Leitura aleatória:");
            for (int i = 0; i < arquivo.getTamanho(); i++) {
                int bloco = inicio + rand.nextInt(arquivo.getTamanho());
                System.out.println("Lendo bloco " + bloco + " [" + disco.getBlocos()[bloco] + "]");
            }
        } else {
            System.out.println("Leitura sequencial:");
            for (int i = inicio; i < fim; i++) {
                System.out.println("Lendo bloco " + i + " [" + disco.getBlocos()[i] + "]");
            }
        }
    }
}
