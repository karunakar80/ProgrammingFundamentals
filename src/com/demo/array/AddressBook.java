package com.demo.array;

import java.util.Arrays;
import java.util.List;

public class AddressBook {

    public static void main(String[] args) {

        List<Contact> al= Arrays.asList(new Contact("kumar","satishkumar","9016765498"),new Contact("sarath","sarathrao","9854322579"));

        al.stream().filter(n->n.firstName.equals("kumar")).map(m->m.phoneNumber).forEach(System.out::println);



    }
    }
