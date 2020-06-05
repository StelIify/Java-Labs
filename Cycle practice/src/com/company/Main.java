/*
 * Classname Main
 *
 * Cycle Practice
 *
 * Copyright Oleksandr Zorenko KNUTE
 */

package com.company;

public class Main {

    public static void main(String[] args) 
    {
        Byte age = 22;
        Short height = 190;
        int weight = 76;
        long myOnlineSalary = 14200;
        double cell = 0672225432;
        char money = '$';
        boolean student = true;
        String name = "Oleksandr";

        String history = ("    My name is " + name + ", and i'm " + age + ". I earn "
                + myOnlineSalary + money +  " my height is " + height + "my weight is "
                + weight +  " my phone number  " + cell +
                " i'm a student " + student);

        System.out.println(history);
        
        //Checking string as a palindrome 
        String str = "Oleksandr";
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
