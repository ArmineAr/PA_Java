package org.example.models;

public class Address {
    private String address1;
    private String address2;
    private String zipCode;
    private String city;
    private String country;

    public Address(String address1, String address2, String zipCode, String city, String country){
        this.address1=address1;
        this.address2=address2;
        this.zipCode=zipCode;
        this.city=city;
        this.country=country;
    }

    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString(){
        return (address1+", "+address2+", "+zipCode+", "+city+", "+country);
    }

}
