package data_structures.BinarySearch;

public class KokoBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int left=1, right=1;
        for(int pile: piles){
            right = Math.max(right, pile);
        }   
        
        while(left<right){
            int mid = left+(right-left)/2;
            int hourSpent = 0;
            for(int pile:piles){
                hourSpent += Math.ceil((double)pile/mid);
            }

            if(hourSpent<=h){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        System.out.println("The minimum speed of eating bananas for Koko is : " + right);

    }
}
