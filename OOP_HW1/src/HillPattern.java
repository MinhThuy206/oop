import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int numRows = sc.nextInt();
        HillPatternA(numRows);
        HillPatternB(numRows);
        HillPatternC(numRows);
        HillPatternD(numRows);

    }

    public static void HillPatternA(int numRows) {
        int numCol = 2 * numRows;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1))
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void HillPatternB(int numRows) {
        int numCol = 2 * numRows;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row <= col) && (row + col <= numCol))
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void HillPatternC(int numRows) {
        int numCol = 2 * numRows;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1))
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int row = 2; row <= numRows; row++) {
            System.out.print("  ");
            for (int col = 2; col <= numCol; col++) {
                if ((row <= col) && (row + col <= numCol))
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void HillPatternD(int numRows) {
        int numCol = 2 * numRows - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > numRows + 1) && (row > col - numRows + 1))
                    System.out.print("   ");
                else
                    System.out.print("  #");
            }
            System.out.println();
        }
        for (int row = 2; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row >= col) || (row + col > numCol))
                    System.out.print("  #");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
