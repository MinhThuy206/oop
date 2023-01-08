import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        System.out.print("   * |\t");
        for (int col = 1; col <= size; col++) {
//            System.out.print(col+ "\t");
            System.out.printf("%4d \t", col);
        }
        System.out.println();
        for (int col = 1; col <= 3 * size; col++) {
            System.out.print("-- ");
        }
        System.out.println();
        for (int row = 1; row <= size; row++) {
            System.out.printf("%4d |\t ", row);
            for (int col = 1; col <= size; col++) {
                int product = row * col;
                System.out.printf("%4d \t", product);
            }
            System.out.println();
        }
    }
}
