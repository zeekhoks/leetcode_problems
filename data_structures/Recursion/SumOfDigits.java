package data_structures.Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 242343;

        int result = sumOfDigitsCalc(n);
        System.out.println("The sum of the digits of n = " + n + " is " + result);
    }

    public static int sumOfDigitsCalc(int n){

        int sum = 0;

        
        if(n==0){
            sum = 0;
        } else {
            sum = n%10 + sumOfDigitsCalc(n / 10);
        }
        return sum;

    }
    
}
