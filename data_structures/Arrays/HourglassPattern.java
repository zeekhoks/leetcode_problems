package data_structures.Arrays;

public class HourglassPattern {
    public static void main(String[] args) {

        int[][] givenArray = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        int result = hourglassSum(givenArray);
        System.out.println("The highest sum of all hourglasses is: " + result);

    }

    public static int hourglassSum (int[][] givenArray){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            for(int j=0 ; j<4; j++){
                // int firstRowSum = givenArray[i][j] + givenArray[i][j+1] + givenArray[i][j+2];
                // int secondRowSum = givenArray[i+1][j+1];
                // int thirdRowSum = givenArray[i+2][j] + givenArray[i+2][j+1] + givenArray[i+2][j+2];
                sum = givenArray[i][j] + givenArray[i][j+1] + givenArray[i][j+2] + givenArray[i+1][j+1] + givenArray[i+2][j] + givenArray[i+2][j+1] + givenArray[i+2][j+2];
                maxSum = Math.max(sum, maxSum);
                sum = 0;
            }
        }

        return maxSum;
    }
}
