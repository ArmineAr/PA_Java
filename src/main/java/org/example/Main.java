package org.example;

import org.example.Exceptions.InvalidNameException;
import org.example.Exceptions.ageException;
import org.example.Exceptions.invalidCountryException;
import org.example.models.Address;
import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.Order;

public class Main {
    public static void main(String[] args) {

        Customer customer=new Customer();
//        Customer customer = new Customer("John",
//                "Smith",
//                "john@gmail.com",
//                "+37477777777",
//                "5 Azatutyun, Yerevan, Armenia");
        try {
        customer.setAge(-11);
     //   System.out.println(customer.getAge()); this is not reachable , if we get exception it
            //will go straight to catch
        } catch (ageException a) {
            System.out.println(a.toString());
            System.out.println("Reset to 20");
            customer.setAge(20);
        }finally {
            System.out.println("Finally always runs, and age is" + customer.getAge());
        }

        try {
            customer.setFirstName("a");
        }catch (InvalidNameException N){
            System.out.println("setting default name to John");
            customer.setFirstName("John");
        }


        Order order = new ExpressOrder(customer, 1500);
        order.getCustomer().printSummary();
        order.printSummery();

//        Customer customer2 = new Customer("John",
//                "Smith",
//                "john@gmail.com",
//                "+37477777777",
//                new Address("Azatutyan","27/14","0024","Yerevan","Armenia"));
//        Order order2 = new ExpressOrder(customer2, 230);
//        order2.getCustomer().printSummary();
//        order2.printSummery();

        try{
        Customer customer3 = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                new Address("Azatutyan","27/14",
                        "0024","Yerevan","Georgia")); }
        catch (invalidCountryException C){
            System.out.println("Cant create a customer with Georgia as a country");
        }

        Order order3 = new ExpressOrder(customer3, 230);
        order3.getCustomer().printSummary();
        order3.printSummery();

    }

}