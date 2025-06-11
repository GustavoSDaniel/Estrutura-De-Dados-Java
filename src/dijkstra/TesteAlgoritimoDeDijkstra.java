package dijkstra;

import java.util.Scanner;
import java.util.List;

public class TesteAlgoritimoDeDijkstra {

    private static final int S1 = 0;
    private static final int S2 = 1;
    private static final int S3 = 2;
    private static final int S4 = 3;
    private static final int S5 = 4;
    private static final int S6 = 5;
    private static final int S7 = 6;
    private static final int S8 = 7;
    private static final int S9 = 8;
    private static final int S10 = 9;
    private static final int S11 = 10;
    private static final int S12 = 11;
    private static final int S13 = 12;
    private static final int S14 = 13;
    private static final int S15 = 14;
    private static final int S16 = 15;
    private static final int S17 = 16;
    private static final int S18 = 17;
    private static final int S19 = 18;
    private static final int S20 = 19;

    public static void main(String[] args) {
        AlgoritimoDeDijkstra algoritimoDeDijkstra = new AlgoritimoDeDijkstra(20);

        // LINHA VERMELHA
        algoritimoDeDijkstra.criarArestas(S1, S2, 16);
        algoritimoDeDijkstra.criarArestas(S2, S3, 14);
        algoritimoDeDijkstra.criarArestas(S3, S4, 12);
        algoritimoDeDijkstra.criarArestas(S4, S5, 12);
        algoritimoDeDijkstra.criarArestas(S5, S6, 14);

        // LINHA VERDE
        algoritimoDeDijkstra.criarArestas(S7, S8, 15);
        algoritimoDeDijkstra.criarArestas(S8, S9, 11);
        algoritimoDeDijkstra.criarArestas(S9, S10, 13);
        algoritimoDeDijkstra.criarArestas(S10, S11, 16);
        algoritimoDeDijkstra.criarArestas(S11, S6, 15);

        // LINHA AMARELA
        algoritimoDeDijkstra.criarArestas(S12, S8, 11);
        algoritimoDeDijkstra.criarArestas(S8, S2, 8);
        algoritimoDeDijkstra.criarArestas(S2, S15, 7);
        algoritimoDeDijkstra.criarArestas(S15, S16, 7);
        algoritimoDeDijkstra.criarArestas(S16, S17, 12);
        algoritimoDeDijkstra.criarArestas(S17, S18, 9);

        // LINHA AZUL
        algoritimoDeDijkstra.criarArestas(S12, S9, 17);
        algoritimoDeDijkstra.criarArestas(S9, S13, 7);
        algoritimoDeDijkstra.criarArestas(S13, S14, 9);
        algoritimoDeDijkstra.criarArestas(S14, S5, 9);
        algoritimoDeDijkstra.criarArestas(S5, S17, 10);

        // LINHA ROXA
        algoritimoDeDijkstra.criarArestas(S10, S13, 11);
        algoritimoDeDijkstra.criarArestas(S13, S3, 13);
        algoritimoDeDijkstra.criarArestas(S3, S16, 11);
        algoritimoDeDijkstra.criarArestas(S16, S19, 13);
        algoritimoDeDijkstra.criarArestas(S19, S20, 12);

        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao Subway System");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        while (true) {
            System.out.println("\nPor favor entre com sua rota ou pressione ENTER para sair do programa");
            System.out.print("Deseja continuar? (s/n): ");
            String continuar = in.nextLine().trim();

            if (continuar.equalsIgnoreCase("n") || continuar.isEmpty()) {
                System.out.println("Saindo do programa...");
                break;
            }

            try {
                int origem = lerEstacao("Origem ", in);
                int destino = lerEstacao("Destino ", in);

                List<Integer> caminho = algoritimoDeDijkstra.caminhoMinimo(origem, destino);

                if (caminho != null) {
                    System.out.print("\nRota mais curta: ");
                    for (int i = 0; i < caminho.size(); i++) {
                        System.out.print((caminho.get(i) + 1));
                        if (i < caminho.size() - 1) {
                            System.out.print(" -> ");
                        }
                    }
                    System.out.println("\nFim da rota");
                } else {
                    System.out.println("Não existe caminho entre estas estações!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                in.nextLine(); // Limpa o buffer do scanner
            }
        }
        in.close();
    }

    private static int lerEstacao(String mensagem, Scanner scanner) {
        while (true) {
            try {
                System.out.print(mensagem + "(1-20): ");
                int estacao = scanner.nextInt() - 1;
                scanner.nextLine(); // Limpa o buffer

                if (estacao >= 0 && estacao < 20) {
                    return estacao;
                } else {
                    System.out.println("Estação inválida! Digite um número entre 1 e 20.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }
}