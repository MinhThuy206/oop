import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0)
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
    }
}
