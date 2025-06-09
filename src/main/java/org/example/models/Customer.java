package org.example.models;


import org.example.Exceptions.AgeException;
import org.example.Exceptions.InvalidNameException;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;
    private Address address;
    public Customer(){}
    public Customer(String firstName,
                    String lastName,
                    String email,
                    String phone,
                    Address address ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    public int getAge(){return age;}
    public void setAge(int age){
        if(age<0){
            throw new AgeException(age + "age should be positive");
        }
        else this.age=age;

    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if(firstName.length()<3){
            throw new InvalidNameException();
        }else{
        this.firstName = firstName;}
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void printSummary() {
        System.out.println("Customer: " + firstName + ", "
                + lastName + ", " + age + ", " + email + ", "
                + phone + address);
   //TODO  //   System.out.println(address.toStringAddress()); ????
    }
    public String toString(){
        return firstName + " "
                + lastName + " " + email + " "
                + phone;
    }
}
