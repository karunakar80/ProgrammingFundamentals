package com.demo.array;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {

    int a[]=new int[4];
    a[0]=3;
    a[1]=3;
    a[2]=3;
    a[3]=3;

        Arrays.stream(a).forEach(System.out::println);

//        for(int i=0;i<a.length;i++) {
//        System.out.println(a[i]);
//
//    }

}
}


