package org.example;

import org.example.Exceptions.AgeException;
import org.example.Exceptions.InvalidCountryException;
import org.example.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /////
        Customer customer1 = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777", new Address("1", "fuchik", "008",
                "Yerevan", "Armenia"));
        try {
            customer1.setAge(-11);
            //  System.out.println(customer.getAge()); this is not reachable , if we get exception it
            //will go straight to catch
        } catch (AgeException a) {
            System.out.println(a.toString());
            System.out.println("Reset to 20");
            customer1.setAge(20);
        } finally {
            System.out.println("Finally always runs, and age is" + customer1.getAge());
        }

        ////////////
        Customer customer2 = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                new Address("Azatutyan", "27/14", "0024", "Abovyan", "Armenia"));

        ///////
        Customer customer3 = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                new Address("Azatutyan", "27/14",
                        "0024", "Tbilisi", "Georgia"));
        ///////////
        Order order1 = new Order(customer1, 230);
        System.out.println(order1.toString());
        order1.printSummary();

        Order order2 = new ExpressOrder(customer2, 1530);
        System.out.println(order2.toString());
        order2.printSummary(); // TODO ??? how to make it the price of Express???

        Order order3 = new InternationalOrder(customer3, 2000);
        System.out.println(order3.toString());
        order3.printSummary(); // TODO ??? how to make it the price of International???
       try {
           order3.shipmentCountryCheck();
       }catch (InvalidCountryException E){
           System.out.println("Please change the destination");
       }

        //////
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        System.out.println("list of orders");
        System.out.println(orders);



}}