public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 7;
        System.out.println(binarySearch(array, key, 0, 5));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx) {
            if (key == array[fromIdx])
                return true;
            else
                return false;
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx])
                return true;
            else if (key < array[middleIdx])
                toIdx = middleIdx - 1;
            else
                fromIdx = middleIdx + 1;
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

}
