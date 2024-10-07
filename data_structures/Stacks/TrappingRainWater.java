package data_structures.Stacks;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = height.length;

        int[] arrRight = new int[n];
        arrRight[n - 1] = height[n - 1];

        int[] arrLeft = new int[n];
        arrLeft[0] = height[0];

        int[] water = new int[n];
        int totalRainWaterTrapped = 0;

        // Construct left array
        for (int i = 1; i < n; i++) {
            arrLeft[i] = Math.max(arrLeft[i - 1], height[i]);
        }

        // Construct right array
        for (int i = n - 2; i >= 0; i--) {
            arrLeft[i] = Math.max(arrRight[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            water[i] = Math.min(arrLeft[i], arrRight[i]) - height[i];
        }

        for (int i = 0; i < water.length; i++) {
            totalRainWaterTrapped = totalRainWaterTrapped + water[i];
        }

        System.out.println("The total rainwater trapped is => " + totalRainWaterTrapped);

    }

}
