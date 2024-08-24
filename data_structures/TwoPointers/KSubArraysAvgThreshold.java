package data_structures.TwoPointers;

public class KSubArraysAvgThreshold {

    public static void main(String[] args) {

        int[] arr = { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 };
        int k = 3;
        int threshold = 5;
        int i = 0;
        int j = 0;
        int count = 0;
        int sum = 0;

        while (j < arr.length) {
            if (j - i + 1 <= k) {
                sum += arr[j];
                if (j - i + 1 == k) {
                    int avg = sum / k;
                    if (avg >= threshold) {
                        count += 1;
                    }
                }
                j++;
            } else if (j - i + 1 > k) {
                sum = sum - arr[i];
                i++;
            }
        }

        System.out.println("The count of subarrays with avg greater than thresholds is : " + count);
    }

}
