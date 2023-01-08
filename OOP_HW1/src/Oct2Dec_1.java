import java.util.Scanner;
public class Oct2Dec_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        if(!(isValidOct(inStr))){
            System.out.printf("The equivalent decimal number  \"%s\" is: %d", inStr, convertOct2Dec(inStr));
        }else{
            System.out.printf("error: invalid hexadecimal string \"%s\"", inStr);
        }
    }
    public static boolean isValidOct(String inStr){
        for(int i=0;i<inStr.length();i++){
            if(!(inStr.charAt(i)>='0' && inStr.charAt(i)<='9')){
                return false;
            }
        }
        return false;
    }
    public static int toOctDec(char ch){
        return Character.digit(ch,8);
    }

    public static int convertOct2Dec(String inStr){
        int num =0;
        for(int i=0;i<inStr.length();i++) {
            int digit = toOctDec(inStr.charAt(i));
            num = num * 8 + digit;
        }
        return num;
    }
}
