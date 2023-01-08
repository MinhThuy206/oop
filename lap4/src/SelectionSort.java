import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

}