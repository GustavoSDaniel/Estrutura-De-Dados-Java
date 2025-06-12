package selectionSort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {29, 10, 14, 37, 13};

        System.out.println("Antes da ordenção");

        for (int num : numeros) {
            System.out.println(num + " ");
        }

        selectionSort(numeros);

        System.out.println("Depois da ordenção");

        for (int num : numeros) {
            System.out.println(num + " ");
        }
    }
}
