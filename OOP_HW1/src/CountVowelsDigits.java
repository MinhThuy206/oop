import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String inStr;
        int inStrlen;
        int numVowels = 0;
        int numDigits = 0;
        double percentsOfVowels = 0;
        double percentsOfDigits = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = sc.nextLine().toLowerCase();
        inStrlen = inStr.length();

        for (int i = 0; i < inStrlen; i++) {
            char ch = inStr.charAt(i);
            if (isNumVowel(ch) ) {
                numVowels++;
            } else if(isNumDigits(ch)) {
                numDigits++;
            }
        }


        percentsOfVowels += (numVowels * 100.0) / inStrlen;
        percentsOfDigits += (numDigits * 100.0) / inStrlen;
        System.out.printf("Number of vowels : %d (%2.2f%%) \nNumber of digits : %d (%2.2f%%)", numVowels, percentsOfVowels, numDigits, percentsOfDigits);
    }
    public static boolean isNumVowel(char ch){
        switch (ch){
            case 'a', 'e', 'i', 'o' -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
    public static boolean isNumDigits(char ch){
        return ch <= '9' && ch >= '0';
    }

}
