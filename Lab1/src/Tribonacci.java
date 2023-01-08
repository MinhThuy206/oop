public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int nMax = 20;
        double sum = fnMinus1 + fnMinus2 + fnMinus3;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print("1 1 2 ");
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            sum += fn;
            System.out.print(fn + " ");
            ++n;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
        }
        System.out.println();
        average = sum / nMax;
        System.out.println("The average is " + average);
    }
}
