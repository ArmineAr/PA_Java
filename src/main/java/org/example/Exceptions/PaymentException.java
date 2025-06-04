package org.example.Exceptions;

public class PaymentException extends RuntimeException{
        public PaymentException(String message) {
            super(message);
        }
}
