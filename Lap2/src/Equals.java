public class Equals {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {1, 2, 3, 4, 5, 8};

        if (equals(array1, array2))
            System.out.println("Tow arrays are exactly the same");
        else
            System.out.println("Tow array are not same");
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
