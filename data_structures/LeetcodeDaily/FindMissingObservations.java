package data_structures.LeetcodeDaily;

public class FindMissingObservations {

    public static void main(String[] args) {

        int[] rolls = { 1, 5, 6 };
        int mean = 3;
        int n = 4;
        int m = rolls.length;
        int observedSum = 0;
        int totalSum = mean * (n+m);
        int[] result = new int[n];


        for (int i = 0; i < rolls.length; i++) {
            observedSum = observedSum + rolls[i];
        }
        int missingSum = totalSum - observedSum;

        int base = missingSum/n;
        int remainder = missingSum%n;

        for(int j=0; j<n;j++){
            result[j] = base + (j<remainder ? 1 : 0);
        }

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }

    
    
}
