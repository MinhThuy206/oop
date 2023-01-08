public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 5000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += 1 / denominator;
        }
        System.out.println("The sum from left-right is " + sumL2R);
        for (int denominator = MAX_DENOMINATOR; denominator > 0; denominator--) {
            sumR2L += 1 / denominator;
        }
        System.out.println("The sum from left-right is " + sumR2L);
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else if (sumR2L > sumL2R) {
            absDiff = sumR2L - sumL2R;
        } else {
            absDiff = 0;
        }
        System.out.println(absDiff);
    }
}
