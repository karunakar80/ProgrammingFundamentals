package com.demo.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {
    public static void main(String[] args) {

        String email = "karunakar#reddyk922@gmail.com";
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + " : " + matcher.matches() + "\n");

    }
}
