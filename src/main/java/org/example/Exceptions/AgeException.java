package org.example.Exceptions;

public class AgeException extends RuntimeException{
    private  String message;
    public AgeException(String message){
        this.message=message;
    }
    public String toString(){
        return message; // how is this method executed if i dont call it ?
    }
}
