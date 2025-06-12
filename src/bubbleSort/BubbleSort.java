package bubbleSort;

public class BubbleSort {

  public static  void  bubblesSort(int[]arr)  {
      for (int i = 0; i < arr.length - 1; i++) {
          for (int j = 0; j < arr.length - i - 1; j++) {
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
      }

  }

    public static void main(String[] args) {

      int[] numeros = {5,3,8,4,2};

        System.out.println("Antes da ordenção");

        for (int num : numeros) {
            System.out.println(num + " ");
        }

        bubblesSort(numeros);

        System.out.println("Depois da ordenção");

        for (int num : numeros) {
            System.out.println(num + " ");
        }
    }


}
