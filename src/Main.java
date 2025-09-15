import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disco disco = new Disco(100);
        Alocacao estrategia = new AlocacaoContigua();

        List<Arquivo> arquivos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- SIMULADOR DE SISTEMA DE ARQUIVOS ---");
            Visualizacao.mostrar(disco);

            System.out.println("\n1. Criar arquivo");
            System.out.println("2. Deletar arquivo");
            System.out.println("3. Ler arquivo");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Nome do arquivo: ");
                String nome = sc.next();
                System.out.print("Tamanho: ");
                int tam = sc.nextInt();
                Arquivo arq = new Arquivo(nome, tam);
                if (estrategia.criarArquivo(disco, arq)) {
                    arquivos.add(arq);
                    System.out.println("Arquivo criado!");
                } else {
                    System.out.println("Falha: sem espaço contíguo!");
                }
            } else if (op == 2) {
                System.out.print("Nome do arquivo: ");
                String nome = sc.next();
                Arquivo alvo = arquivos.stream().filter(a -> a.getNome().equals(nome)).findFirst().orElse(null);
                if (alvo != null) {
                    estrategia.deletarArquivo(disco, alvo);
                    arquivos.remove(alvo);
                    System.out.println("Arquivo deletado!");
                }
            } else if (op == 3) {
                System.out.print("Nome do arquivo: ");
                String nome = sc.next();
                Arquivo alvo = arquivos.stream().filter(a -> a.getNome().equals(nome)).findFirst().orElse(null);
                if (alvo != null) {
                    System.out.print("Leitura aleatória? (s/n): ");
                    boolean aleatoria = sc.next().equalsIgnoreCase("s");
                    estrategia.lerArquivo(disco, alvo, aleatoria);
                    int tempo = Metricas.tempoLeitura(alvo, aleatoria);
                    System.out.println("Tempo de acesso: " + tempo + "ms");
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
