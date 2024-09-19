package data_structures.BitManipulation;

public class NumberOfOnesBits {
    
    public static void main(String[] args) {
        
        int n=11;
        int count=0;
        
        for(int i=0; i<32; i++){
            if((n & i) == 1) {
                count++;
            }
            n = n >>> 1;
            System.out.println("Right shifted by 1 => " + n);
        }

        System.out.println("The hamming weight is => " + count);
    }
}
