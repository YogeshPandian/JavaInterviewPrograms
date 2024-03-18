package com.practice.javainterviewprograms;

import java.util.Scanner;

public class ReverseNumber {
    private final Scanner scanner;
    public ReverseNumber(){
        scanner = new Scanner(System.in);
    }
    //Logic 1: Using algorithm
    public void reverseNumberUsingAlgorithm() {
        System.out.println("Enter the number to be reverse(Logic 1 - Using Algorithm): ");
        int numberToBeReverse = scanner.nextInt();
        int reverseUpdatedValue = 0;
        while (numberToBeReverse != 0) {
            reverseUpdatedValue = reverseUpdatedValue * 10 + numberToBeReverse % 10;// Any number %10 will give you the last digit
            numberToBeReverse = numberToBeReverse / 10;//Any number/10 it will eliminate the last digit and rest of the digits will given
        }
        System.out.println("Reverse Number: " + reverseUpdatedValue);
    }
    //Logic 2: Using StringBuffer
    public void reverseNumberUsingStringBuffer(){
        System.out.println("Enter the number to be reverse(Logic 2 - Using StringBuffer): ");
        int numberToBeReverse = scanner.nextInt();
        StringBuffer convertingIntToString = new StringBuffer(String.valueOf(numberToBeReverse));//valueOf method will convert the given integer(numberToBeReverse) into string. stores the converted String value into Stringbuffer object (convertingIntToString)
        StringBuffer reverseUpdatedValue = convertingIntToString.reverse();//StringBuffer class have reverse method. Now object of StringBuffer(convertingIntToString) holds the converted String. by using the reverse method reverse the String.
        System.out.println("Reverse Number: " + reverseUpdatedValue);
    }
    //Logic 3: Using StringBuilder
    public void reverseNumberUsingStringBuilder(){
        System.out.println("Enter the number to be reverse(Logic 3 - Using StringBuilder): ");
        int numberToBeReverse = scanner.nextInt();
        StringBuilder appendTheInteger = new StringBuilder();
        StringBuilder append = appendTheInteger.append(numberToBeReverse);//StringBuilder class have append method which just append the given numbers
        StringBuilder reverseUpdatedValue = append.reverse();//StringBuilder class also have reverse method. Now object of StringBuffer(convertingIntToString) holds the appended number. by using reverse method reverse the number.
        System.out.println("Reverse Number: " + reverseUpdatedValue);
    }

    public static void main(String[] args) {
        ReverseNumber reverse = new ReverseNumber();
        reverse.reverseNumberUsingAlgorithm();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        reverse.reverseNumberUsingStringBuffer();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        reverse.reverseNumberUsingStringBuilder();
    }
}