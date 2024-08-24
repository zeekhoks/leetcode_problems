package data_structures.Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 8;
        int result = fibonacciCalc(n);
        System.out.println("The Fibonacci series leading to n = " + n + " is " + result);
    }
    
    private static int fibonacciCalc(int n){
        int calculation = 0;

        if(n<=0){
            calculation = 0;
        } else if(n==1){
            calculation = 1;
        } else if(n>=2){
            calculation = fibonacciCalc(n-1) + fibonacciCalc(n-2);
        }
        return calculation;
    }
}
