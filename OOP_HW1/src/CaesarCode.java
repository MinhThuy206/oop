import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string : ");
        String inStr = sc.nextLine().toUpperCase();
        int inStrLen = inStr.length();
        StringBuilder outStr = new StringBuilder();

        for (int i = 0; i < inStrLen; i++) {
            char Char = inStr.charAt(i);
            outStr.append((char) (Char + 3));
        }
        System.out.println("The ciphertext string is : " + outStr);

    }
}
