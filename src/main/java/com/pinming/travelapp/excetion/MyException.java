package com.pinming.travelapp.excetion;

public class MyException extends Exception {

    private String message;

    public MyException() {
        //super();
    }

    public MyException(String message) {
        super(message);
        this.message = message;
    }
}
