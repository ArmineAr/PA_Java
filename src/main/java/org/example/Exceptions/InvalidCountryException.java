package org.example.Exceptions;

public class InvalidCountryException extends RuntimeException{
    public InvalidCountryException(){
        }
    public String toString(){
        return "we dont deliver to Georgia";
    }

}
