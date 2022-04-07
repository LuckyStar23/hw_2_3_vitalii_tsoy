package com.company;

public class User {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length()>20) {
            throw new IllegalNameLengthException("Имя должно быть менее 20 символов",name);
        }
        else{
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <=100){
            this.age=age;
        }
        else{
            throw new IllegalAgeException("Не подходящий возраст", age);
        }
    }




    }

