package data_structures.LeetcodeDaily;

import java.util.*;

public class TimeDifference {

    public static void main(String[] args) {

        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("23:59");
        // timePoints.add("00:00");

        int[] intTimepoints = new int[timePoints.size()];
        int minTimeDifference = Integer.MAX_VALUE;

        for (int i = 0; i < timePoints.size(); i++) {
            int newTimePoint = removeColon(timePoints.get(i));
            
                newTimePoint =  newTimePoint % 100;
            
            intTimepoints[i] = newTimePoint;
        }

        Arrays.sort(intTimepoints);

        for(int i: intTimepoints){
            System.out.println(i);
        }

        // int time2 = intTimepoints[1];
        // int time1 = intTimepoints[0];
        // minTimeDifference = time2 % 100 + (60 - time1 % 100);
        // if (minTimeDifference >= 60) {
        //     minTimeDifference = minTimeDifference - 60;
        // }
        // minTimeDifference = time2-time1;
        // System.out.println("The minimum time difference in minutes is => " + minTimeDifference);

    }

    private static int removeColon(String timePoint) {
        if (timePoint.length() == 4) {
            timePoint = timePoint.substring(0, 1) + timePoint.substring(2);
        } else if (timePoint.length() == 5) {
            timePoint = timePoint.substring(0, 2) + timePoint.substring(3);
        }

        return Integer.valueOf(timePoint);
    }
}
