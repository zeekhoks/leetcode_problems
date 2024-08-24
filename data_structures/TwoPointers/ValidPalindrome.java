package data_structures.TwoPointers;

public class ValidPalindrome {

    private static boolean isValidChar(char c){
        if(c>='0' && c<='9'){
            return true;
        }
        if(c>='a' && c<='z'){
            return true;
        }
        if(c>='A' && c<='Z'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // String s = "race a car";
        
        // s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        // s = s.replaceAll("\\s+","");
        System.out.println("Value of s after processing " + s);
        s=s.toLowerCase();
        char[] charArray = s.toCharArray();
        int i=0, j=charArray.length-1;
        boolean checkValidPalindrome =true;
        while(i<j){
            while(i<j && !isValidChar(charArray[i])) i++;
            while(i<j && !isValidChar(charArray[j])) j--;
            if(charArray[i]==charArray[j]){
                i++;
                j--;
            } else {
                checkValidPalindrome=false;
                break;
            }
        }
        System.out.println("Is the string a valid palindrome? Answer: " + checkValidPalindrome);
    }
}
