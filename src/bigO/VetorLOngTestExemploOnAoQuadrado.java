package bigO;

public class VetorLOngTestExemploOnAoQuadrado {

     private static final int TAMANHO = 100000;  //UMA CONSTANTE

    // TEMPO DE EXECUÇÃO: Tempo de execução: 3471 ms O(n²)

    public static void main(String[] args) {

        long [] array = new long [TAMANHO];

        long startTime = System.currentTimeMillis(); // GRAVA O TEMPO DE INICIALIZAÇÃO DO ALGORITIMO

        for (int i = 0; i < TAMANHO; i ++) {

            for (int j = 0; j < TAMANHO; j ++) {

                array[i] += j;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime - startTime) + " ms");
    }

}
