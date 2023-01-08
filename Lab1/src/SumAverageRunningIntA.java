public class SumAverageRunningIntA {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        double average;
        for (int i = 111; i <= 8899; i++) {
            sum += i;
            ++count;
        }
        average = (float) (sum / count);
        System.out.println("the sum is : " + sum);
        System.out.println("The average is : " + average);
    }
}
