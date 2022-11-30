package com.demo.array.calculator;

import java.util.Scanner;

public class AddTwoNumbers {
public static void main(String [] args) {

    Scanner userInput = new Scanner(System.in);

    int numberOne;
    int numberTwo;
    int sum=0;


        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();

    sum = numberOne + numberTwo;
    System.out.println("The sum of " + numberOne + " and " + numberTwo  + " is " + sum);

}

}
