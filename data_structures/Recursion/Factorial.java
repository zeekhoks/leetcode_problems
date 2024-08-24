package data_structures.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorialCalc(n);
        System.out.println("The factorial for n = " + n + " is " + result);

    }

    public static int factorialCalc  (int n){
        int factorial = 1;
        if ((n>1)) {
            factorial = n * factorialCalc(n-1);
        }
        return factorial;
    }
}
