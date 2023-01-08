public class SumAverageRunningIntB {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int number = 0; number <= 100; number++) {
            if (number % 2 == 1) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        //absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven): (sumEven-sumOdd);
        System.out.println(absDiff);
    }
}
