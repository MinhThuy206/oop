import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5, 2, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int last;
        for (int i = 1; i < array.length; i++) {
            last = array[i];
            int j = i;
            while ((j > 0) && (array[j - 1] > last)) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = last;
        }
    }
}
