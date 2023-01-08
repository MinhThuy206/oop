import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper_bound = sc.nextInt();
        System.out.println("These numbers are equal to the product of prime factors: ");
        getPrimeFactors(upper_bound);
    }
    public static void getPrimeFactors(int upper_bound){
        int temp=0;
        for(int i=1;i<=upper_bound;i++){
            if(isProductOfPrimeFactors(i)){
                System.out.print(i+" ");
                    temp++;
            }
        }
        double persent = (double) temp * 100 / upper_bound;
        System.out.println();
        System.out.printf("[%d numbers found (%.2f%%)]", temp, persent);
    }
    public static boolean isProductOfPrimeFactors(int aPosInt){
        int product = 1;
        for(int i=2;i<aPosInt;i++){
            if(isPrime(i) &&aPosInt % i ==0){
                product *=i;
            }
        }
        return product == aPosInt;
    }
    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        } else if (aPosInt == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
                if (aPosInt % i == 0)
                    return false;
            }
        }
        return true;
    }
}
