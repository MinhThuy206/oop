import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5, 2, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
    }
}
