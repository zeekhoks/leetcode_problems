package data_structures.BinarySearch;

public class MinInRotatedArray {

    public static void main(String[] args) {
        
        int[] nums = {3,1,2};

        int left=0 , right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]<nums[right]){
                right = mid-1;
            } else {
                left=mid+1;
            }
        }
        System.out.println("The minimum value of rotated array is : " + nums[left]);
    }
    
}
