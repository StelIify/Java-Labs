/*
 * Classname Main
 *
 * Cycle Practice
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * 1.Write to console 8 facts about yourself using primitive types. (2 points)
 * 2.Check a string as a palindrome ( 2 points)
 * 3.Get the area limited by the following functions   x = 0 .. 3.14;    y = sin(x);   y = 0.1 * k, where k is the last cipher in your student card; (2 points)
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
        String str = "It was this scar, that made Harry so particularly unusual!";
        str = str.replaceAll(" ","")                            
             .replaceAll(",","")
             .replaceAll("\\.","")
             .replaceAll("_","")
             .replaceAll("-","")
             .replaceAll("-","")
             .replaceAll("\\?","")
             .replaceAll("\\!","")
             .replaceAll("\\\"", "");
        
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
        
         //Getting the area
         double finish = Math.PI;
         double deltaX = 0.01;
         double y = 0.1;                                                        
         double rectangle;
         double area = 0;

          for (double x = 0; x < finish; x += deltaX) 
          {
             if (Math.sin(x) <= y) 
             {
               rectangle = Math.sin(x) * deltaX;
             }
             else
             {
                rectangle = y * deltaX;
             }
                area += rectangle;
             }
            System.out.println(area);

    }
}
