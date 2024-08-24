package data_structures.TwoPointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] nums = {1,8,6,2,5,4,8,3,7};
        int i=0;
        int j=nums.length-1;
        int max_area=0;
        while(i<j){
            if(nums[i]<nums[j]){
                int area = (j-i)*(nums[i]);
                max_area = Math.max(area, max_area);
                i++;
            } else {
                int area = (j-i)*(nums[j]);
                max_area = Math.max(area, max_area);
                j--;
            }
        }
        System.out.println("The max area of water that can be stored is: " + max_area);
    }
    
}
