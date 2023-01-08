public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println("GCD is: " + getGCD(a, b));
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
