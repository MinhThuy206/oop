import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays = {1, 2, 3, 4, 5, 6};
        System.out.print("Enter a key: ");
        int key = sc.nextInt();

        if (contains(arrays, key))
            System.out.printf("This array contains element %d", key);
        else
            System.out.printf("This array don't contains element %d", key);
    }

    public static boolean contains(int[] array, int key) {
        for (int j : array) {
            if (j == key)
                return true;
        }
        return false;
    }
}
