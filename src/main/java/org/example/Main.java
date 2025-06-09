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

        ///HOMEWORK
        //1 new list from the quare of all even number
        ArrayList<Integer> numbers3=new ArrayList<>(Arrays.asList(-2,0,1,4,5,8,9,10,13,14));
        ArrayList<Integer> numbersEven=new ArrayList<>();
        for (int number:numbers3){
            if (number%2==0 && number!=0){
                numbersEven.add(number);
            } }
            System.out.println(numbers3);
            System.out.println(numbersEven);

        //students list
        ArrayList<Student> studentsList= new ArrayList<>();
        studentsList.add(new Student("Armine", "Arakelyan", 87, 18));
        studentsList.add(new Student("Ani", "Narinyan", 50, 19));
        studentsList.add(new Student("Aram", "Stepanyan", 82, 22));
        studentsList.add(new Student("David", "Sargsyan", 72, 18));

        //2.sorting array of objects by property  / Comparing objects
        //TODO ??? couldnt do it on my own
     //   Collections.sort(studentsList);

        //3. find the avarage of student ages
        float sumAge=0;
        for (Student student:studentsList){
            sumAge += student.getAge();
        }
        System.out.println("average of student age is "+(sumAge/(studentsList.size())));

        //4 Find and print users that have score higher than 85
        ArrayList<Student> studentsListHighGrade= new ArrayList<>();
        for (Student student:studentsList){
            if (student.getGrade()>85){
                studentsListHighGrade.add(student);
            }
        }
        System.out.println(studentsListHighGrade.toString());

        //5 check if there is a student named David
        boolean hasDavid=false;
        for (Student student:studentsList) {
            if (student.getName().equalsIgnoreCase("david")) {
                hasDavid=true;
                System.out.println("yes there is at least one student named David");
                break;
            }   // TODO ?? do i need else here ?
          }
        if (!hasDavid) {
            System.out.println("No there is no David");
        }

        //6 remove students with grades lower tha 60
        //TODO ??? getting error java.util.ConcurrentModificationException??

//        for (Student student:studentsList){
//            if (student.getGrade()<60){
//                studentsList.remove(student);
//            }
//        }
//        System.out.println(studentsList.toString());

        // 7 return the list of student whoes name starts with A
        ArrayList<Student> studentsListStartingWithA= new ArrayList<>();
        for (Student student:studentsList){
            if (student.getName().toLowerCase().startsWith("a")){
                studentsListStartingWithA.add(student);
            }
        }
        System.out.println(studentsListStartingWithA.toString());

}}