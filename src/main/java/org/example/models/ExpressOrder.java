package org.example.models;

public class ExpressOrder extends Order implements Deliverable {
    public ExpressOrder(Customer customer, double price) {
        super(customer, price);         //TODO ??? dont understand how this works
    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }
    public void printSummery() {
        super.printSummary();
        System.out.println("Type: Express Order. Delivery Price: AMD" + calculateDeliveryPrice());
    }
}
