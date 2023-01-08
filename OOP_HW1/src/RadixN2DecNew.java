import java.util.Scanner;

public class RadixN2DecNew {
    final static String hexCode = "0123456789abcdef";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String inStr = sc.nextLine().toLowerCase();
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        if (isValidRadix(inStr, radix)) {
            System.out.printf("The equivalent decimal number  \"%s\" is: %d", inStr, convertRadixN2Dec(inStr, radix));
        } else {
            System.out.printf("error: invalid  string \"%s\"", inStr);
        }
    }

    public static boolean isValidRadix(String inStr, int radix) {
        for (int i = 0; i < inStr.length(); i++) {
            if (!(inStr.charAt(i) >= '0' || hexCode.indexOf(inStr.charAt(i)) > radix)) {
                return false;
            }
        }
        return true;
    }

    public static int toRadixDigit(char ch, int radix) {
        return Character.digit(ch, radix);
    }

    public static int convertRadixN2Dec(String inStr, int radix) {
        int num = 0;
        for (int i = 0; i < inStr.length(); i++) {
            int digit = toRadixDigit(inStr.charAt(i), radix);
            num = num * radix + digit;
        }
        return num;
    }
}
