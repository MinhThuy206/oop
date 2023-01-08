public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        //Using a for_loop
        for (double number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
        }
        average = (float) sum / 100;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);

        // Use a while-do
        int sum1 = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum1 += number;
            ++number;
        }
        double average1 = (float) sum1 / 100;
        System.out.println("The sum of 1 to 100 is " + sum1);
        System.out.println("The average is " + average1);


        // use a do while
        int sumA = 0;
        double averageA;
        int numberA = LOWERBOUND;
        do {
            sumA += numberA;
            numberA++;
        } while (numberA <= UPPERBOUND);
        averageA = (float)sumA / UPPERBOUND;
        System.out.println("The sum of 1 to 100 is " + sumA);
        System.out.println("The average is " + averageA);

        //Using a while_do
        int sumB = 0;
        double averageB;
        int numberB = LOWERBOUND;
        while (numberB <= UPPERBOUND) {
            sumB += numberB;
            numberB++;
        }
        averageB = (float) sumB / UPPERBOUND;
        System.out.println("The sum of 1 to 100 is " + sumB);
        System.out.println("The average is " + averageB);
    }

}
