import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper_bound = sc.nextInt();
        getPrime(upper_bound);
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        } else if (aPosInt == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
                if (aPosInt % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void getPrime(int upper_bound) {
        int temp = 0;
        for (int i = 0; i <= upper_bound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                temp++;
            }
        }
        double persent = (double) temp * 100 / upper_bound;
        System.out.printf("[%d primes found (%.2f%%)]", temp, persent);
    }
}
