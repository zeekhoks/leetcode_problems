package data_structures.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = { 4, 1, 2, 1, 2 };
        int xorResult = 0;

        for (int i = 0; i < nums.length; i++) {
            xorResult = xorResult ^ nums[i];
        }

        System.out.println("The single number in the array is => " + xorResult);

    }
}
