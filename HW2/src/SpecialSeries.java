public class SpecialSeries {
    public static void main(String[] args) {
        double x = 0.5;
        System.out.println(specialSeries(x));
    }

    public static double F(double x, int numTerms) {
        double temp1 = 1;
        double temp2 = 1;
        for (int i = 1; i <= 2 * numTerms; i++) {
            if (i % 2 == 1)
                temp1 = temp1 * i;
            else
                temp2 = temp2 * i;
        }
        return (temp1 * Math.pow(x, 2 * numTerms + 1)) / (temp2 * (2 * numTerms + 1));
    }

    public static double specialSeries(double x) {
        int numTerms = 1;
        double sum = x;
        while (F(x, numTerms) > -1) {
            sum += F(x, numTerms);
            numTerms++;
        }
        return sum;
    }
}

