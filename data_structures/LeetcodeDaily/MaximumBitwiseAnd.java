package data_structures.LeetcodeDaily;

public class MaximumBitwiseAnd {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 3, 2, 2 };
        int n = nums.length;
        int count = 0;
        int longestSubarrayLength = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            k = Math.max(k, nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==k) {
                count++;
            } else {
                longestSubarrayLength = Math.max(longestSubarrayLength, count);
                count=0;
            }
        }
        longestSubarrayLength = Math.max(longestSubarrayLength, count);

        System.out.println("The longest sub-array with maximum bitwise and result is => " + longestSubarrayLength);
    }
}
