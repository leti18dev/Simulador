public class Visualizacao {
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";

    public static void mostrar(Disco disco) {
        String[] blocos = disco.getBlocos();
        for (int i = 0; i < blocos.length; i++) {
            String cor = blocos[i].equals("L") ? RESET : VERDE;
            System.out.printf("%02d[%s%s%s] ", i, cor, blocos[i], RESET);
            if ((i+1) % 10 == 0) System.out.println();
        }
    }
}
