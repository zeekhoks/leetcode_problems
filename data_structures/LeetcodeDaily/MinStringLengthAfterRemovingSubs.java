package data_structures.LeetcodeDaily;

public class MinStringLengthAfterRemovingSubs {
    public static void main(String[] args) {
        
        String s = "ABFCACDB";
        int count = 0;
        int i=0;

        while (i >= 0 && i + 2 < s.length()) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') {
                s = s.substring(0, i) + s.substring(i + 2);
                count = s.length();
            } else if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'){
                s = s.substring(0, i) + s.substring(i + 2);
                count = s.length();
            }
            i++;
        }
        System.out.println("The length of the string is => " + count);
    }
}