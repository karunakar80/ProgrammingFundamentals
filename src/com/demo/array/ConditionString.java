package com.demo.array;

public class ConditionString {


    public static void main(String[] args) {

        String var = "kumar";
        String slr = "Kumar";

        if (var.equals(slr)) {
            System.out.println("this equals of two Strings using equals method");
        } else {
            System.out.println("this is not equals of two Strings using equals method");
        }


        if (var.equalsIgnoreCase(slr)) {
            System.out.println("this equals of two Strings using equalsIgnoreCase method");
        } else {
            System.out.println("this equals of two Strings using equalsIgnoreCase method");
        }

    }
}




