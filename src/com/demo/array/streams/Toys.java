package com.demo.array.streams;

import java.util.*;
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

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = sc.nextLine();
        System.out.println("enter second name");
        String  secondName= sc.nextLine();
        System.out.println("enter third name");
        String  thirdName= sc.nextLine();
        System.out.println("enter third name");
        String  forthName= sc.nextLine();
        System.out.println("enter third name");
        String  fifthName= sc.nextLine();
        System.out.println("enter third name");
        String  sixthName= sc.nextLine();


        List<Toys> al = Arrays.asList(new Toys("Education Prime Set", 384.95), new Toys("Christmas Tree", 44.99), new Toys("Freight Train", 199.99), new Toys("Stunt Arena", 159.99), new Toys("Material Handler", 149.99), new Toys("Castle Expansion Set", 129.99));
        Map<Object, Toys>  employeeMap=al.stream().filter(n->n.getName().equals(firstName)||n.getName().equals(secondName)||n.getName().equals(thirdName)||n.getName().equals(forthName)||n.getName().equals(fifthName)||n.getName().equals(sixthName)).collect(Collectors.toMap(e->e, Function.identity()));

        Optional<Double> vs=employeeMap.entrySet().stream().map(n->n.getValue().getPrice()).reduce((a,b)->a+b);
        System.out.println("Total price :"+vs.get());

    }
}








