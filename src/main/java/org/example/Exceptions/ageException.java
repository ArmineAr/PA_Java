package org.example.Exceptions;

public class ageException extends RuntimeException{
    private  String message;
    public ageException(String message){
        this.message=message;
    }
    public String toString(){
        return message; // how is this method executed if i dont call it ?
    }
}
