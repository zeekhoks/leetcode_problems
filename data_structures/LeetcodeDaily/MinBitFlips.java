package data_structures.LeetcodeDaily;

public class MinBitFlips {

    public static void main(String[] args) {

        int start = 10;
        int goal = 7;

        String binaryStart = Integer.toBinaryString(start);
        // System.out.println(binaryStart);
        String binaryGoal = Integer.toBinaryString(goal);
        // System.out.println(binaryGoal);
        int count = 0;

        if (binaryStart.length() < binaryGoal.length()) {
            int difference = binaryGoal.length() - binaryStart.length();
            for (int i = 0; i < difference; i++) {
                binaryStart = "0" + binaryStart;
            }
        } else if (binaryGoal.length() < binaryStart.length()) {
            int difference = binaryStart.length() - binaryGoal.length();
            for (int i = 0; i < difference; i++) {
                binaryGoal = "0" + binaryGoal;
            }
        }

        System.out.println(binaryStart);
        System.out.println(binaryGoal);

        for (int i = 0; i < binaryGoal.length(); i++) {
            if (binaryGoal.charAt(i) != binaryStart.charAt(i)) {
                count++;
            }
        }
        System.out.println("The minimum number of flips is : " + count);
    }

}
