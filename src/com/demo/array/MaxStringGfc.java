package com.demo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxStringGfc {


    public static void main(String[] args) {

String [] arr={"kumar","karunakarreddy","shs"};

List<String> names=Arrays.asList(arr);
//ex.1 find Longest name in List using max(Integer::compare).get()
String longestString = names
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Longest String is = " + longestString);




//ex.2   find Length of Longest name in List using max(Integer::compare).get()


        int lengthOflongestString = names.stream()
                .map(String::length)
                .max(Integer::compare)
                .get();
        System.out.println("\nLength of Longest String is = "
                + lengthOflongestString);

    }
    }