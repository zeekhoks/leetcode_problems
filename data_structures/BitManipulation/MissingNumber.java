package data_structures.BitManipulation;

public class MissingNumber {
    
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = nums.length;
        int arraySum=0;
        int missingNumberSum=0;
        int j=0;

        for(int i=0; i<n;i++){
            arraySum+= nums[i];
        }

        while(j<=n){
            missingNumberSum += j;
            j++;
        }

        System.out.println("The missing number is => " + (missingNumberSum - arraySum));
    }
}
