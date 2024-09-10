package com.practice.javainterviewprograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String string = scanner.next();
        String originalString = string;
        String reverse = "";
        int lengthOfString = string.length();
        for (int i = lengthOfString-1;i>=0;i--){
            reverse=reverse+string.charAt(i);
        }
        if (originalString.equals(reverse)){
            System.out.println(originalString+" is a palindrome string");
        }else{
            System.out.println(originalString+" is not a palindrome string");
        }
    }
}
