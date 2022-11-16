package com.demo.array;


import java.util.Arrays;

public class ArrayExample1 {

    public static void main(String[] args) {

        int a[]=new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=40;

        Arrays.stream(a).forEach(System.out::println);

//        for(int i=0;i<a.length;i++) {
//            System.out.println(a[i]);
//
//        }

    }
}

