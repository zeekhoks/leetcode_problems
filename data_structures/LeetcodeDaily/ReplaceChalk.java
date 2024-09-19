package data_structures.LeetcodeDaily;

public class ReplaceChalk {

    public static void main(String[] args) {
        int[] chalk = { 2,2,3 };
        int k = 1;
        int currentChalk = 0;
        int studentToReplaceChalk = 0;

        while (k > 0) {
            for (int i = 0; i < chalk.length; i++) {
                currentChalk = chalk[i];
                if (k == 0 || k < currentChalk) {
                    studentToReplaceChalk = i;
                    break;
                }
                k = k - chalk[i];

            }
            if(studentToReplaceChalk > 0) break;
        }

        System.out.println("Student that will replace chalk = " + studentToReplaceChalk);
    }

}
