public class FibonacciInt {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int F1 = 1;
        int F2 = 1;
        int i = 2;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (Integer.MAX_VALUE - F2 > F1) {
            i++;
            F1 = F1 + F2;
            System.out.printf("F(%d) = %d\n", i, F1);
            i++;
            F2 = F1 + F2;
            System.out.printf("F(%d) = %d\n", i, F2);
        }
        System.out.printf("F(%d) is out of the range of int", i + 1);

    }
}
