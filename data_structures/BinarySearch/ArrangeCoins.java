package data_structures.BinarySearch;

public class ArrangeCoins {
    
    public static void main(String[] args) {
        int n = 10;
        int result = 0, left =0, right=n;
        // Brute force solution
        // for(int i=1; i<=n;i++){
        //     temp = temp-i;
        //     if(temp==0){
        //         result = i;
        //         break;
        //     } else if(temp<0){
        //         result = i-1;
        //         break;
        //     } 
        // }
        while(left<=right){
            int mid = left + (right-left)/2;
            long coins = (long)((mid/2.0) * (mid+1)); 
            if(coins>n){
                right=mid-1;
            } else {
                left =mid+1;
                result = Math.max(result,mid);
            }
        }
        System.out.println("The number of complete rows is: " + result );
    }
}
