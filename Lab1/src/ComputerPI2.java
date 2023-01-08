public class ComputerPI2 {
    public static void main(String[] args) {
        int MAX_TERM = 10000;
        double sum = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        double pi = 4 * sum;
        System.out.println(pi);
        System.out.println(pi / (Math.PI) * 100);
    }

}
