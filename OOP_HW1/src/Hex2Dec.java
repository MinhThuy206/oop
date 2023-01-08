import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {
        String hexCode = "0123456789abcdef";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal: ");
        String inStr;
        inStr = input.next().toLowerCase();
        boolean tag = true;
        int num = 0;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            int n = hexCode.indexOf(inStr.charAt(charIdx));
            if (n == -1) {
                tag = false;
                break;
            }
            num = n * (int) Math.pow(16, inStr.length() - charIdx - 1) + num;
        }
        if (tag) {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, num);
        } else {
            System.out.printf("error: invalid hexadecimal string \"%s\"", inStr);
        }
    }


}
