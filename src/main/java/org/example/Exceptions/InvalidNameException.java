package org.example.Exceptions;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(){}
    public String toString(){
        return "Name should be at least 3 chars";
    }

}
