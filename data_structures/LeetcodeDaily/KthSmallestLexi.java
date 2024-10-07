package data_structures.LeetcodeDaily;

public class KthSmallestLexi {

    private long countSteps(long curr, long n){
        long steps = 0;
        long first = curr;
        long last = curr+1;
        while(first<=n){
            steps += Math.min(n+1, last)-first;
            first*=10;
            last*=10;

        }

        return steps;
    }

    public int findKthNumber(int n, int k){

        long curr = 1;
        k = k-1;
        while(k>0){
            long steps = countSteps(curr, n);
            if(steps<=k){
                curr+=1;
                k-=steps;
            } else {
                curr*=10;
                k=k-1;
            }
        }
        return (int) curr;
    }

    public static void main(String[] args) {
        KthSmallestLexi solution = new KthSmallestLexi();
        
        // Test Case 1
        long count1 = solution.countSteps(1, 13);
        System.out.println("Count Steps for curr=1, n=13: " + count1); // Expected: 5
        
        // Test Case 2
        long count2 = solution.countSteps(2, 13);
        System.out.println("Count Steps for curr=2, n=13: " + count2); // Expected: 1
        
        // Test Case 3
        long count3 = solution.countSteps(10, 100);
        System.out.println("Count Steps for curr=10, n=100: " + count3); // Expected: 10
    }
    
}
