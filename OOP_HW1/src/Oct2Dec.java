import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        String hexCode = "0123456789";
        String inStr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        inStr = input.next().toLowerCase();
        boolean tag = false;
        int num = hexCode.indexOf(inStr.charAt(0));

        for (int charIdx = inStr.length()-1; charIdx >=0; charIdx--) {
            int n = hexCode.indexOf(inStr.charAt(charIdx));
            if(n==-1){
                tag = false;
                break;
            }
            num = n * (int) Math.pow(8, inStr.length() - charIdx - 1) + num;
        }
        System.out.printf("The equivalent decimal number  \"%s\" is: %d", inStr, num);
    }
}