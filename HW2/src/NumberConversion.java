import java.util.Scanner;

public class NumberConversion {
    public static final String hexStr = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toUpperCase();
        System.out.println(N2Dec(inStr, 16));
    }

    public static int N2Dec(String in, int Radix) {
        int num = 0;
        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);
            int n = hexStr.indexOf(ch);
            num += Math.pow(Radix, in.length() - i - 1) * n;
        }
        return num;
    }
}
