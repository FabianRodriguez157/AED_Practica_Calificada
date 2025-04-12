package diseñoDeAlgoritmos;

public class MergeSort {

    public void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeSortRecursivo(array, 0, array.length - 1);
    }
    private void mergeSortRecursivo(int[] array, int inicio, int fin) { //dividir el arreglo en mitades
        if (inicio >= fin) {
            return;
        }
        int medio = (inicio + fin) / 2;
        mergeSortRecursivo(array, inicio, medio);
        mergeSortRecursivo(array, medio + 1, fin);
        merge(array, inicio, medio, fin);
    }
    private void merge(int[] array, int inicio, int medio, int fin) { //mecanismo de que fusiona dos mitades ordenadas del arreglo original
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        int[] izquierda = new int[n1];
        int[] derecha = new int[n2];

        for (int i = 0; i < n1; i++) {
            izquierda[i] = array[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            derecha[j] = array[medio + 1 + j];
        }
        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                array[k] = izquierda[i];
                i++;
            } else {
                array[k] = derecha[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = izquierda[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }
}