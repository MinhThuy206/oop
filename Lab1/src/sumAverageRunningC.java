public class sumAverageRunningC {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("The sum of the squares is: " + sum);
    }
}
