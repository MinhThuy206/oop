import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        String hexCode = "0123456789abcdef";
        String inStr;
        int radix;
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        radix = input.nextInt();

        System.out.print("Enter a Hexadecimal: ");
        inStr = input.next().toLowerCase();

        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            int n = hexCode.indexOf(inStr.charAt(charIdx));
            num = n * (int) Math.pow(radix, inStr.length() - charIdx - 1) + num;
        }
        System.out.printf("The equivalent decimal number \"%s\" is: %d ", inStr, num);
    }
}
