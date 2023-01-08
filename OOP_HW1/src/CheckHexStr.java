import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string : ");
        String inStr = sc.nextLine();
        if (Check(inStr))
            System.out.printf("\"%s\" is a hex String", inStr);
        else
            System.out.printf("\"%s\" is NOT a hex String", inStr);
    }

    public static boolean Check(String inStr) {
        int inStrLen = inStr.length();
        for (int i = 0; i < inStrLen; i++) {
            char inChar = inStr.charAt(i);
            if (!((inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f') || (inChar >= '0' && inChar <= '9')))
                return false;
        }
        return true;
    }
}

