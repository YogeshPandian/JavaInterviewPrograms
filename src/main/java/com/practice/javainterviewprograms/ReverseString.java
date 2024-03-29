package com.practice.javainterviewprograms;

public class ReverseString {
    //Logic 1: Using Concatenation operator
    public static void revStringUsingConcatenation() {
        String stringToBeReversed = "Yogi";
        String reverse = "";//Initializing a empty string
        for (int i = stringToBeReversed.length() - 1; i >= 0; i--) { //length of the string is 4 since we are going to use chatAt method we start from last index of the string (3) to first index (0). so decrement 3 to 0 and condition must be if it reaches less than 0 come out of the loop.
            reverse = reverse + stringToBeReversed.charAt(i);
            /*
             * reverse initial value is empty
             * stringToBeReversed.charAt(i) starts with 3 which is i. now reverse value is i. ""= ""+i //i
             * now charAt(i) is 2 which is g. now the value of reverse is i = i + g//ig
             * now charAt(i) is 1 which is o. now the value of reverse is ig = ig + o//igo
             * now charAt(i) is 0 which is Y. now the value of reverse is igo = igo + Y//igoY
             * now charAt(i) is -1. Condition i>=0//-1>=0 is not satisfied. so come out of the loop.
             * */
        }
        System.out.println(reverse);
    }
    public static void revStringUsingCharArray(){
        String stringToBeReversed = "Yogesh";
        String reverse = "";
        char[] charArrayOfStringRev = stringToBeReversed.toCharArray();
        int lengthOfString = charArrayOfStringRev.length;
        for(int i=lengthOfString-1;i>=0;i--){
            reverse = reverse+charArrayOfStringRev[i];
        }
        System.out.println(reverse);
    }
    public static void revStringUsingStringBuffer(){
        String stringToBeReversed ="Siva";
        StringBuffer reverseString = new StringBuffer(stringToBeReversed);
        System.out.println(reverseString.reverse());
    }
    public static void main(String[] args) {
        ReverseString.revStringUsingConcatenation();
        ReverseString.revStringUsingCharArray();
        ReverseString.revStringUsingStringBuffer();
    }
}
