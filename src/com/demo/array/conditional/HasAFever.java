package com.demo.array.conditional;

import java.util.Scanner;

public class HasAFever {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("What’s your temperature:");

        int value=sc.nextInt();
        if(value>100){
            System.out.println("You have a feve");

        }else{
            System.out.println("You don't have a fever.");

        }

    }
    }
