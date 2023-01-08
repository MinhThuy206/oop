public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6};
        int key = 2;
        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));

    }

    public static boolean linearSearch(int[] array, int key) {
        for (int j : array) {
            if (key == j) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return 0;
    }
}
