package com.demo.array.streams;

import java.util.Arrays;

public class SumEvenNumbers {

    public static void main(String[] args) {
        int[]  arr={5, 9, 11, 2, 8, 21, 1};

        //print even numbers
        Arrays.stream(arr).filter(n->n%2==0).map(n->n*2).forEach(System.out::println);

        //sum of all numbers eve numbers
        int  cl= Arrays.stream(arr).filter(n->n%2==0).map(n->n*2).sum();
        System.out.println(cl);
    }
    }
