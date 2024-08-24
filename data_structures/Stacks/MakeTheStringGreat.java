package data_structures.Stacks;

import java.util.*;

public class MakeTheStringGreat {
    
    public static void main(String[] args) {
        
        String s = "leEeetcode";
        String newStr = s;
        int i=0; int j=1;
        while(j<newStr.length()){
            if((newStr.charAt(i)-32)==newStr.charAt(j) || (newStr.charAt(i)+32)==newStr.charAt(j)){
                if(newStr.length()==2){
                    newStr="";
                } else {
                    newStr = newStr.substring(0, i) + newStr.substring(j+1);
                    i=0; 
                    j=1;
                }
            } else {
                i++;
                j++;
            }
        }
        
        System.out.println(newStr);
    }
}
