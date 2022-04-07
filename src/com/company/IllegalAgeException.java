package com.company;

public class IllegalAgeException extends RuntimeException{
    private int age;

    public IllegalAgeException(String message, int age) {
        super(message);
        this.age = age;


    }

    public int getAge() {
        return age;
    }


}
