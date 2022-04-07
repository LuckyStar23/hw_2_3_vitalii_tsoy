package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();
   while (true){
       try {
           user.setName("Vitalii");
           System.out.println(user.getName());
       } catch (IllegalNameLengthException e) {
           System.out.println(e.getMessage());
       }

        try {
            user.setAge(212);
            System.out.println(user.getAge());
            break;
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
            break;

        }




   }
    }
}
