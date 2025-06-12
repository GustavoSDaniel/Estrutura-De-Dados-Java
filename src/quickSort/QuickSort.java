package quickSort;

public class QuickSort {

    // Método principal que inicia o processo de ordenação
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Já está ordenado ou é inválido
        }
        quickSort(array, 0, array.length - 1);
    }

    // Método recursivo que implementa o QuickSort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Encontra a posição do pivô, array[p] está no lugar certo
            int pivotIndex = partition(array, low, high);

            // Ordena recursivamente os elementos antes e depois do pivô
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Método que particiona o array usando o último elemento como pivô
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Escolhe o último elemento como pivô
        int i = low - 1; // Índice do menor elemento

        for (int j = low; j < high; j++) {
            // Se o elemento atual é menor ou igual ao pivô
            if (array[j] <= pivot) {
                i++;

                // Troca array[i] e array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Troca array[i+1] e array[high] (ou o pivô)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Retorna a posição do pivô
    }

    // Método auxiliar para imprimir o array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};

        System.out.println("Array original:");
        printArray(array);

        sort(array);

        System.out.println("\nArray ordenado:");
        printArray(array);
    }
}
