package data_structures.TwoPointers;

public class BestTimeStock {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int i = 0, j = 1;
        int maxDiff = 0;
        int lowestStock = Integer.MAX_VALUE;

        while (i < j && j < prices.length) {
            lowestStock = Math.min(lowestStock, prices[i]);
            maxDiff = Math.max(maxDiff, prices[j] - lowestStock);
            j++;
            i++;
        }
        System.out.println("The maximum profit is : " + maxDiff);
    }

}
