package data_structures.LeetcodeDaily;

public class MaximumWidthRamp {

    public static void main(String[] args) {

        int[] nums = { 9,8,1,0,1,9,4,0,4,1 };
        // Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int i = 0;
        int j = 0;
        int maxDiff = Integer.MIN_VALUE;

        while (j < n) {
            if (i < j && nums[i] <= nums[j]) {
                maxDiff = Math.max(maxDiff, j - i);
            } else if (i < j && nums[i] >= nums[j]) {
                i++;
            }
            j++;
        }

        System.out.println("The max width ramp is => " + maxDiff);
    }
}
