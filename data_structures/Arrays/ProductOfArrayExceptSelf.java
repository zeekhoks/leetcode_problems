package data_structures.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length];

        int prefix = 1, postfix = 1;
        for(int i=0; i<nums.length;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        for(int i=nums.length-1; i>=0;i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }
        
        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    
}
