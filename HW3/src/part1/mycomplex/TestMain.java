package part1.mycomplex;
import java.util.Scanner;
public class TestMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double [] array1 = new double[2];
        for (int j = 0; j < 2; j++) {
            array1[j] = sc.nextDouble();
        }

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double [] array2 = new double[2];
        for (int j = 0; j < 2; j++) {
            array2[j] = sc.nextDouble();
        }
        MyComplex myComplex_1 = new MyComplex(array1[0],array1[1]);
        MyComplex myComplex_2 = new MyComplex(array2[0],array2[1]);

        System.out.print("Number 1 is: ");
        System.out.println(myComplex_1);
        if(myComplex_1.isReal()){
            System.out.println(myComplex_1 +" is a pure number");
        }else System.out.println(myComplex_1 + " is NOT a pure number");
        if(myComplex_1.isImaginary()){
            System.out.println(myComplex_1 +" is a pure imaginary");
        }else{
            System.out.println(myComplex_1 +" is NOT a pure imaginary");
        }

        System.out.print("Number 2 is: ");
        System.out.println(myComplex_2);
        if(myComplex_2.isReal()){
            System.out.println(myComplex_1 +" is a pure number");
        }else {
            System.out.println(myComplex_1 + " is NOT a pure number");
        }
        if(myComplex_2.isImaginary()){
            System.out.println(myComplex_2 +" is a pure imaginary");
        }else{
            System.out.println(myComplex_2 +" is NOT a pure imaginary");
        }

        if (myComplex_1.equals(myComplex_2)) {
            System.out.println(myComplex_1 +" is equal to "+ myComplex_2);
        }else{
            System.out.println(myComplex_1 +" is NOT equal to "+ myComplex_2);
        }

        MyComplex add = myComplex_1.addInto(myComplex_2);
        System.out.println(myComplex_1 +" + "+ myComplex_2 + " = " + add);
    }
}
