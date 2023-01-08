public class NumberSequence {
    public static void main(String[] args) {
        System.out.println(len(100));
    }

    public static int numOfDigits(int n) {
        int num = 1;
        while (n / 10 > 0) {
            n /= 10;
            num++;
        }
        return num;
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        } else {
            return len(n - 1) + numOfDigits(n);
        }
    }
}