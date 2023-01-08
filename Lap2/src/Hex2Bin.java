import java.util.Scanner;

public class Hex2Bin {

    static final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
    static final String digits = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = sc.nextLine().toUpperCase();

        if (!Check(inStr)) {
            System.out.print("Invalid");
        } else {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is : ", inStr);
            for (int i = 0; i < inStr.length(); ++i) {
                int idx = digits.indexOf(inStr.charAt(i));
                System.out.print(" " + HEX_BITS[idx]);
            }
        }
    }

    public static boolean Check(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            int bit = digits.indexOf(inStr.charAt(i));
            if (bit == -1) {
                return false;
            }
        }
        return true;
    }
}

