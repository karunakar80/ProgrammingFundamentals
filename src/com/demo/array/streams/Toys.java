package com.demo.array.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Toys {
    private  String name;
    private  double price;


    public Toys(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public static <al> void main(String[] args) {


        List<Toys> al = Arrays.asList(new Toys("Education Prime Set", 384.95), new Toys("Christmas Tree ", 44.99), new Toys("Freight Train ", 199.99), new Toys("Stunt Arena ", 159.99), new Toys("Material Handler", 149.99), new Toys("Castle Expansion Set ", 129.99));
        Map<Object, Toys>  employeeMap=al.stream().collect(Collectors.toMap(e->e, Function.identity()));

        Optional<Double> vs=employeeMap.entrySet().stream().map(n->n.getValue().getPrice()).reduce((a,b)->a+b);
        System.out.println(vs.get());

    }}