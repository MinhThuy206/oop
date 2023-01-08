public class TrigonometricSeries {
    public static void main(String[] args) {
        double x = Math.PI / 4;
        System.out.println(sin(x));
        System.out.println(cos(x));
    }

    public static double Fsin(double x, int numTerms) {
        int a;
        if (numTerms % 2 == 0)
            a = 1;
        else
            a = -1;
        double temp = 1;
        for (int i = 1; i <= 2 * numTerms + 1; i++)
            temp = temp * x / i;
        return a * temp;
    }

    public static double sin(double x) {
        double sin = 0;
        int numTerms = 0;
        while (Math.abs((Fsin(x, numTerms))) > 0.00001) {
            sin += Fsin(x, numTerms);
            numTerms++;
        }
        return sin;
    }

    public static double Fcos(double x, int numTerms) {
        int a;
        if (numTerms % 2 == 0)
            a = 1;
        else
            a = -1;
        double temp = 1;
        for (int i = 1; i <= 2 * numTerms; i++)
            temp = temp * x / i;
        return a * temp;
    }

    public static double cos(double x) {
        double cos = 1;
        int numTerms = 1;
        while (Math.abs((Fcos(x, numTerms))) > 0.00001) {
            cos += Fcos(x, numTerms);
            numTerms++;
        }
        return cos;
    }
}


