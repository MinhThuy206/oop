import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper_bound = sc.nextInt();
        System.out.println("There number are perfect: ");
        getPerfectNum(upper_bound);
        System.out.println();
        System.out.println("These number are neither deficient nor perfect: ");
        getDeficientNum(upper_bound);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt)
            return true;
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt)
            return true;
        return false;
    }

    public static void getPerfectNum(int upper_bound) {
        int temp = 0;
        for (int i = 1; i <= upper_bound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                temp++;
            }
        }
        System.out.println();
        double percent = (double) temp * 100 / upper_bound;
        System.out.printf("[%d perfect numbers found (%.2f%%)] ", temp, percent);
    }

    public static void getDeficientNum(int upper_bound) {
        int temp = 0;
        for (int i = 1; i <= upper_bound; i++) {
            if (!(isDeficient(i) || isPerfect(i))) {
                System.out.print(i + " ");
                temp++;
            }
        }
        System.out.println();
        double percent = (double) temp * 100 / upper_bound;
        System.out.printf("[%d  numbers found (%.2f%%)] ", temp, percent);
    }
}
