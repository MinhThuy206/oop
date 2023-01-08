import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    public static int remainder(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a > b)
                return a % b;
            else
                return b % a;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, remainder(a, b));
        }
    }
}

