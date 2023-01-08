public class Factorial {
    public static void main(String[] args){
        int n = 20;
        long factorial = 1; // result will cross the integer limit if used int
        for (int i =1; i <= n; i++){
            factorial = factorial*i;
        }
        System.out.println("The Factorial of "+ n+ " is "+ factorial);
    }
}

