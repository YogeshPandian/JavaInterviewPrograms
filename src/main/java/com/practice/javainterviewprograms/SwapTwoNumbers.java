package com.practice.javainterviewprograms;

public class SwapTwoNumbers {
    /*
    5 Different ways of swapping two numbers
    What is swapping?
    Interchanging the values into variables
    For example:
    FirstVariable=1 and SecondVariable=2 after swapping FirstVariable=2 and SecondVariable=1
     */

    //Logic 1: Using Third variable
    public static void swapTwoNumbersUsingThirdVariable(){
        int firstVariable=1;
        int secondVariable=2;
        int thirdVariable;
        System.out.println("Logic 1: Using Third Variable");
        System.out.println("Before Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
        thirdVariable=firstVariable;//1
        firstVariable=secondVariable;//2
        secondVariable=thirdVariable;//1
        System.out.println("After Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
    }
    //Logic 2: Using Arithmetic Operators Addition(+) and Subtraction(-). Without using Third variable
    public void swapTwoNumbersUsingArithmeticOperatorsPlusAndMinus(int firstVariable, int secondVariable){
        System.out.println("Logic 2: Arithmetic Operators Addition(+) and Subtraction(-)");
        System.out.println("Before Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
        firstVariable=firstVariable+secondVariable;//10+20=30
        secondVariable=firstVariable-secondVariable;//30-20=10
        firstVariable=firstVariable-secondVariable;//30-10=20
        System.out.println("After Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
    }
    //Logic 3: Using Arithmetic Operators Multiplication(*) and Division(/). Without using Third variable
    //Rule: Either of the variable should not have zero
    public static void swapTwoNumbersUsingArithmeticOperatorsMulAndDiv(){
        int firstVariable=100;
        int secondVariable=200;
        System.out.println("Logic 3: Arithmetic Operators Multiplication(*) and Division(/)");
        System.out.println("Before Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
        firstVariable=firstVariable*secondVariable;//100*200=20000
        secondVariable=firstVariable/secondVariable;//20000/200=200
        firstVariable=firstVariable/secondVariable;//20000/200=100
        System.out.println("After Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
    }
    //Logic 4: Using Bitwise XOR Operator. Without using Third variable
    //XOR(^-Caret) operator converts decimal into binary
    //Same number returns 0. Different number returns 1
    public static void swapTwoNumbersUsingBitwiseXOR_Operator(){
        int firstVariable=1000;
        int secondVariable=2000;
        System.out.println("Logic 4: Bitwise XOR Operator");
        System.out.println("Before Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
        firstVariable=firstVariable^secondVariable;//1000^2000=3000
        secondVariable=firstVariable^secondVariable;//3000^2000=1000
        firstVariable=firstVariable^secondVariable;//3000^1000=2000
        System.out.println("After Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
    }
    //Logic 4: Using Single Statement. Without using Third variable
    //XOR(^-Caret) operator converts decimal into binary
    //Same number returns 0. Different number returns 1
    public static void swapTwoNumbersUsingSingleStatement(){
        int firstVariable=10000;
        int secondVariable=20000;
        System.out.println("Logic 5: Single Statement");
        System.out.println("Before Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
        secondVariable=firstVariable+secondVariable-(firstVariable=secondVariable);
        /*
        * Here execution starts from right to left
        * (firstVariable=secondVariable):So first secondVariable value(20000) assigned to first variable
        * Now firstVariable Value is 20000
        * firstVariable+secondVariable: 10000+20000=30000
        * secondVariable=firstVariable+secondVariable-(firstVariable=secondVariable)= 30000-20000=10000
        * Now secondVariable value is 10000
        * */
        System.out.println("After Swapping values:");
        System.out.println("FirstVariable="+firstVariable+" SecondVariable="+secondVariable);
    }
    //Main Method
    public static void main(String[] args) {
        SwapTwoNumbers.swapTwoNumbersUsingThirdVariable();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SwapTwoNumbers usingArithmeticOperatorsPlusAndMinus = new SwapTwoNumbers();
        usingArithmeticOperatorsPlusAndMinus.swapTwoNumbersUsingArithmeticOperatorsPlusAndMinus(10,20);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SwapTwoNumbers.swapTwoNumbersUsingArithmeticOperatorsMulAndDiv();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SwapTwoNumbers.swapTwoNumbersUsingBitwiseXOR_Operator();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SwapTwoNumbers.swapTwoNumbersUsingSingleStatement();
        //check update
    }
}
