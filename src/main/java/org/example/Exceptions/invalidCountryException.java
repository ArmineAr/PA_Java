package org.example.Exceptions;

public class invalidCountryException extends RuntimeException{
    public invalidCountryException(){
        }
    public String toString(){
        return "we dont deliver to Georgia";
    }

}
