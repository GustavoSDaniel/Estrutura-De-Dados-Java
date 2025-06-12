package buscaLinear;

public class BuscaLinear {

    public static int buscaLinear(int arr[], int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
