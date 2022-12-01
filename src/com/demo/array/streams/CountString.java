package com.demo.array.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {

        String[] ardr = {"kumar", "karunaarreddy", "java", "karunaarreddy", "sharathrao"};

        //count key and values
        Map<String, Long> sl = Arrays.stream(ardr).filter(n -> n.length() > 5).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(sl);

        //counts all the elements whose length is greater than 5, and returns the final count.

      long val= Arrays.stream(ardr).filter(n -> n.length() > 5).count();
        System.out.println(val);




    }
}