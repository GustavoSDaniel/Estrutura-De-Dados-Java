package mergeSort;

public class MergeSort {
    
    // Método principal que inicia o processo de ordenação
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Já está ordenado ou é inválido
        }
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length - 1);
    }

    // Método recursivo que divide o array
    private static void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // Encontra o meio

            // Ordena a primeira metade
            mergeSort(array, temp, left, middle);

            // Ordena a segunda metade
            mergeSort(array, temp, middle + 1, right);

            // Combina as metades ordenadas
            merge(array, temp, left, middle, right);
        }
    }

    // Método que combina dois subarrays ordenados
    private static void merge(int[] array, int[] temp, int left, int middle, int right) {
        // Copia ambas as metades para o array temporário
        System.arraycopy(array, left, temp, left, right - left + 1);

        int i = left;       // Índice inicial da primeira metade
        int j = middle + 1;  // Índice inicial da segunda metade
        int k = left;       // Índice inicial do array mesclado

        // Combina as duas metades em ordem
        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes da primeira metade (se houver)
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }

    // Método auxiliar para imprimir o array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Array original:");
        printArray(array);

        sort(array);

        System.out.println("\nArray ordenado:");
        printArray(array);
    }
}
