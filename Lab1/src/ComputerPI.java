public class ComputerPI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 10000000;
        for (double denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            if (denominator % 4 == 1) {
                sum += 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1 / denominator;
            } else {
                System.out.println("Impossible");
            }
        }
        System.out.println(4 * sum);
    }
}
