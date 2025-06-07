package bigO;

import java.util.HashMap;

public class HashMapTestO1 {
    private static final int TAMANHO = 100000;  //UMA CONSTANTE

    // TEMPO DE EXECUÇÃO: Tempo de execução: 7 ms O(1)

    public static void main(String[] args) {
        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        for (int i = 1; i <= TAMANHO; i++) {
            mapa.put(i, new Produto(i, "produto", i*20.00));
        }

        long startTime = System.currentTimeMillis(); // GRAVA O TEMPO DE INICIALIZAÇÃO DO ALGORITIMO

        int codigoASerEncontrado = TAMANHO;

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = mapa.get(qtd);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime - startTime) + " ms");
    }

}
