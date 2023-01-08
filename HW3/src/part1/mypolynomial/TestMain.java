package part1.mypolynomial;

public class TestMain {
    public static void main(String[] args) {
        double[] coeff1 = {1.1, 2.2, 3.3};
        double[] coeff2 = {4.4, 5.5, 6.6, 1.1};
        MyPolynomial myPolynomial1 = new MyPolynomial(coeff1);
        MyPolynomial myPolynomial2 = new MyPolynomial(coeff2);
        // in da thuc
        System.out.println(myPolynomial1);
        // gtri cua da thuc
        System.out.println(myPolynomial1.evaluate(5));
        // tong hai da thuc
        MyPolynomial addPoly = myPolynomial1.add(myPolynomial2);
        System.out.println(addPoly);
        // tich hai da thuc
        MyPolynomial multy = myPolynomial1.multiply(myPolynomial2);
        System.out.println(multy);
    }
}
