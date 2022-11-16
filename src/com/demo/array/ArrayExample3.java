package com.demo.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayExample3 {
    public static void main(String[] args) {
        int a[]=new int[7];
        a[0]=2;
        a[1]=23;
        a[2]=2;
        a[3]=2;
        a[4]=2;
        a[5]=2;
        a[6]=2;

        Arrays.stream(a).forEach(System.out::println);


//        for(int i=0;i<a.length;i++) {
//            System.out.println(a[i]);
//
//        }
    }
    }
