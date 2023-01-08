import java.util.Scanner;

public class Hex2Dec_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal: ");
        String inStr = sc.nextLine().toLowerCase();
        if (!isValidHexString(inStr)) {
            System.out.printf("The equivalent decimal number  \"%s\" is: %d", inStr, convertHex2Dec(inStr));
        } else {
            System.out.printf("error: invalid hexadecimal string \"%s\"", inStr);
        }

    }

    public static boolean isValidHexString(String hexString) {
        for (int i = 0; i < hexString.length(); i++) {
            if (!(hexString.charAt(i) >= '0' && hexString.charAt(i) <= '9') || (hexString.charAt(i) >= 'a' && hexString.charAt(i) >= 'f')) {
                return false;
            }
        }
        return true;
    }

    public static int toHexDigit(char ch) {
        return Character.digit(ch, 16);
    }

    public static int convertHex2Dec(String inStr) {
        int num = 0;
        for (int i = 0; i < inStr.length(); i++) {
            int dig = toHexDigit(inStr.charAt(i));
            num = num * 16 + dig;
        }
        return num;
    }
}
