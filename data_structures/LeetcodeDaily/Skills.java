package data_structures.LeetcodeDaily;

import java.util.Arrays;

public class Skills {
    public static void main(String[] args) {
        int[] skill = {5,1,4,2,3,3};
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length - 1;
        long sum = skill[i] + skill[j];
        int chemistry = 0;

        while (i <= j) {
            if (skill[i] + skill[j] == sum) {
                chemistry += skill[i] * skill[j];
            } else {
                chemistry = -1;
                break;
            }
            i++;
            j--;
        }

        System.out.println("Chemistry: " + chemistry);
    }
}
