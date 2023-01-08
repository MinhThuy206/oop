import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s decimal number : ");
        int decimal = sc.nextInt();
        int rem;
        StringBuilder hex = new StringBuilder();
        while (decimal > 0) {
            rem = decimal % 16;
            hex.append(HEX_CHAR[rem]);
            decimal = decimal / 16;
        }
        System.out.print("The equivalent hexadecimal number is ");
        for (int i = hex.length() - 1; i >= 0; i--) {
            System.out.print(hex.charAt(i));
        }
    }
}
