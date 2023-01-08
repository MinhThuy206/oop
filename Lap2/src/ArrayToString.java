import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] intTestOne = {1};
        int[] intTestEmp = {};
        int[] intTestMul = {1, 2};

        System.out.print(arrayToString(intTestMul));
    }

    public static String arrayToString(int[] array) {
        String arrayString ="[";
        for(int element : array){
            arrayString += element +",";
        }
        arrayString = arrayString.trim();
        arrayString = arrayString.substring(0,arrayString.length()-1);

        arrayString += "]";
        return arrayString;
    }
}
