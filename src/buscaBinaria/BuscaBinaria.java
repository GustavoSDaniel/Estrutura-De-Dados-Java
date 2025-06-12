package buscaBinaria;

public class BuscaBinaria {

    public static int buscaLinear(int arr[], int valor) {

        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (arr[meio] == valor) {
                return meio;
            }
            if (arr[meio] < valor) {
                inicio = meio + 1;
            }else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
