package com.demo.array.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectStrings {

    public static void main(String[] args) {
        String [] ardr={"kumar","karunaarreddy","java","karunaarreddy","sharathrao"};
List<String> vl=Arrays.asList(ardr);
Arrays.stream(ardr).filter(n->n.length()>5).sorted().forEach(System.out::println);


        //ex.2  counts all the elements whose length is greater than 5, and returns the final count.
//       String fl= String.valueOf(vl.stream().filter(n->n.length()>5).count());
//
//        System.out.println(fl);


    }

    }
