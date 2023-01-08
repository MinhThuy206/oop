import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        BoxPatternA(size);
        BoxPatternB(size);
        BoxPatternC(size);
        BoxPatternD(size);
    }

    public static void BoxPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == 8)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void BoxPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == row)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void BoxPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void BoxPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1 || row == col)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
