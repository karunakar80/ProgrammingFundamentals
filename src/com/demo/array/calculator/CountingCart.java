package com.demo.array.calculator;

public class CountingCart {


    public static void main(String [] args) {
        try {
            String[] al ={ "One","two","three","four","five","six","seven","eight","nine","ten"};
            for (int i = 1; i <=al.length; i++) {
                System.out.println(i + "=" + al[i - 1]);
            }
        }catch (Exception e){

            e.printStackTrace();
        }

    }
    }
