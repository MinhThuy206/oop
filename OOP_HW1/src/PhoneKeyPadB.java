import java.util.Scanner;

public class PhoneKeyPadB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toLowerCase();
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            switch (inChar) {
                case 'a', 'b', 'c' ->   //  No break for 'a' and 'b' , fall thru 'c'
                        System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'q', 'r', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
                default -> System.out.print(inChar);
            }
        }
    }
}