package org.example.models;

public class InternationalOrder extends Order implements Deliverable {
    public InternationalOrder(Customer customer, double price) {
        super(customer, price);
    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;
    }


}
