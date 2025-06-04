package org.example.models;

import org.example.Exceptions.PaymentException;

public class Order implements Comparable<Order>{
    protected Customer customer;
    protected double price;
    public Order(Customer customer) {
        this.customer = customer;
        this.price = 0;
        //TODO ?? how to have outgenerated next ID for each order
    }
    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }

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
//    public void shipment(){
//        if (price <= 0) {
//            throw new PaymentException("Please make a payment for " + getId());
//        }
//        System.out.println("Shipment started for " + getId());
//    } //TODO dont get how to add IDs
    @Override
    public String toString(){
        return customer+" " + price;  //// ??? dont get how does it go het the toString of cosutmer ?
    }
    @Override
    public int compareTo(Order o) {
        if(this.price<o.price){
            return -1;
        } else if (this.price>o.price) {
            return 1;
        }else return 0;
    }
    public void printSummary() {
        System.out.println("Order Price: AMD" + price);
    }
}
