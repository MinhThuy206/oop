import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of item : ");
        NUM_ITEMS = input.nextInt();
        items = new int[NUM_ITEMS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated  by spce : ");
            for (int i = 0; i < items.length; i++) {
                items[i] = input.nextInt();
            }
        }
        System.out.print(Arrays.toString(items));
    }
}
