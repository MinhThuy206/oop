import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        final int CONST = 'A' + 'Z';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string : ");
        String inStr = sc.nextLine().toUpperCase();
        int inStrlen = inStr.length();
        StringBuilder Str = new StringBuilder();

        for (int i = 0; i < inStrlen; i++) {
            char Char = inStr.charAt(i);
            Str.append((char) (CONST - Char));
        }
        System.out.println("The ciphertext is :" + Str);
    }
}
