import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int inNumber;
        inNumber = sc.nextInt();
        int inDigit = 0;
        while (inNumber > 0) {
            inDigit = inDigit * 10 + inNumber % 10;
            inNumber /= 10;
        }
        System.out.println("The reverse is : " + inDigit);

    }
}
