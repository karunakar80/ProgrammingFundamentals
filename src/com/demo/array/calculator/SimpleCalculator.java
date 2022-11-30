package com.demo.array.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int sum = 0;


        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();

        sum = numberOne + numberTwo;

       int difference = numberOne - numberTwo;
        int product = numberOne*numberTwo;

        int   average = sum / 2;

        System.out.println("Sum of Two Numbers:"+sum);
        System.out.println("Difference of Two Numbers:"+difference);
        System.out.println("product of Two Numbers:"+product);
        System.out.println("average of Two Numbers:"+average);
        System.out.println("the difference between integers:"+ Math.abs(numberOne - numberTwo));
        System.out.println("The maximum (the larger of the two integers) : "+Math.max(numberOne ,numberTwo));
        System.out.println("The minimum (smaller of the two integers) :"+ Math.min(numberOne ,numberTwo));




    }
}