package com.practice.javainterviewprograms;

public class CountEvenandOdd {
    public static void main(String[] args) {
        int num = 12345;
        int oddCount = 0;
        int evenCount = 0;
        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("Odd numbers: "+oddCount);
        System.out.println("Even numbers: "+evenCount);
    }
}
