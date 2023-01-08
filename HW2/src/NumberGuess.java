import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Java NumberGuess");
        System.out.println("Key in your guess ");
        int number = sc.nextInt();
        int count = 0;
        while (number != SECRET_NUMBER) {
            if (number < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            number = sc.nextInt();
            count++;
        }
        System.out.printf("You got it in %d trials !", count);

    }
}

