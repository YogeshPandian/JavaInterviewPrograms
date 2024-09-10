package com.practice.javainterviewprograms;

import java.util.Scanner;

public class GreatestOfThreeNum {
    public static void greatestOfThreeNormal(){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("First number is greatest: "+firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println("Second number is greatest: "+secondNumber);
        }else{
            System.out.println("Third number is greatest: "+thirdNumber);
        }
    }

    public static void main(String[] args) {
        GreatestOfThreeNum.greatestOfThreeNormal();
    }

}
