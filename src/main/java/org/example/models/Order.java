package org.example.models;

import org.example.Exceptions.InvalidCountryException;
import org.example.Exceptions.PaymentException;

public class Order implements Comparable<Order>{
    protected Customer customer;
    protected double price;
    private static int nextId = 1;

    private int id;
    public Order(Customer customer) {
        this.customer = customer;
        this.price = 0;
        //TODO ?? how to have outgenerated next ID for each order
        this.id = nextId++;
    }
    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
        this.id = nextId++;
    }
    public int getId() {         return id;    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void shipment(){
        if (price <= 0) {
            throw new PaymentException("Please make a payment for " + getId());
            //TODO ??why here i cant use ID but i have to use getID?
        }
        System.out.println("Shipment started for " + getId());
    }
    public void shipmentCountryCheck(){
        if (customer.getAddress().getCountry().equalsIgnoreCase("Georgia")) {
            throw new InvalidCountryException();
            //TODO ?? I dont get what this method does and why we need the to string in the exception class
        }
        System.out.println("cant ship to Geoorgia");
    }
    @Override
    public String toString(){
        return "ID: "+id + ", Customer: " + customer + ", Address:"+ customer.getAddress() + ", Price: " + price;
        //// TODO ?? dont get how does it go get the toString of cosutmer ?
    }

    public void printSummary() {
        System.out.println("Order Price: AMD" + price);
        //TODO ?? whats the difference of toString and printSummary
    }
    @Override
    public int compareTo(Order o) {
        if(this.price<o.price){
            return -1;
        } else if (this.price>o.price) {
            return 1;
        }else return 0;
    }
}
