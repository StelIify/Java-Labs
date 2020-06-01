package com.company;

import java.io.Console;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception
    {
        String data = "";
        String [] words = null;

        File myFile = new File("C:\\Users\\StelLify\\Desktop\\Harry Potter.txt");
        Scanner myReader = new Scanner(myFile);

        while (myReader.hasNextLine())
        {
            data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

        words = data.replaceAll("[^A-Za-z]+", "").split(" ");

        for (int i=0; i< words.length;i++)
        {
            System.out.println(words[i]);
        }

        String notSortedArray [] = new String[] { "Harry", "looked", "nothing", "like", "the", "rest"};
        String temp;

        for (int i = 0; i < notSortedArray.length; i++)
        {
            for (int j = i + 1; j < notSortedArray.length; j++)
            {
                if (notSortedArray[i].compareTo(notSortedArray[j])>0)
                {
                    temp = notSortedArray[i];
                    notSortedArray[i] = notSortedArray[j];
                    notSortedArray[j] = temp;
                }
            }
        }

        System.out.println("Words in alphabetic order: ");

        for (int i =0; i < notSortedArray.length;i++)
        {
            System.out.println(notSortedArray[i]);
        }













    }
}
