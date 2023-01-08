import java.util.Scanner;

public class PhoneKeyPadA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toLowerCase();
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if (inChar == 'a' || inChar == 'b' || inChar == 'c')
                System.out.print(2);
            else if (inChar == 'd' || inChar == 'e' || inChar == 'f')
                System.out.print(3);
            else if (inChar == 'g' || inChar == 'h' || inChar == 'i')
                System.out.print(4);
            else if (inChar == 'j' || inChar == 'k' || inChar == 'l')
                System.out.print(5);
            else if (inChar == 'm' || inChar == 'n' || inChar == 'o')
                System.out.print(6);
            else if (inChar == 'p' || inChar == 'q' || inChar == 'r' || inChar == 's')
                System.out.print(7);
            else if (inChar == 't' || inChar == 'u' || inChar == 'v')
                System.out.print(8);
            else if (inChar == 'w' || inChar == 'x' || inChar == 'y' || inChar == 'z')
                System.out.print(9);
            else
                System.out.print(inChar);
        }
    }
}
