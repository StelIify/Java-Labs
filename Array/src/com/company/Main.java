/*
 * Classname Main
 *
 * Array Practice
 *
 * Copyright Oleksandr Zorenko KNUTE
 */

package com.company;

import java.io.Console;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception
    {
        String data = "";
        String [] words = null;
        
        // Read novel from the file
        File myFile = new File("C:\\Users\\StelLify\\Desktop\\Harry Potter.txt");
        Scanner myReader = new Scanner(myFile);

        while (myReader.hasNextLine())
        {
            data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        
        // Spliting novel into an array of words and cleaning from punctuation signs
        words = data.replaceAll("[^A-Za-z]+", "").split(" ");

        for (int i=0; i< words.length;i++)
        {
            System.out.println(words[i]);
        }
        
        //Getting array distinct words
        String distinctWords [] = data.split(" ");
        String temp;
        
        //Order the words in alphabetic order
        for (int i = 0; i < distinctWords.length; i++)
        {
            for (int j = i + 1; j < distinctWords.length; j++)
            {
                if (distinctWords[i].compareTo(distinctWords[j])>0)
                {
                    temp = distinctWords[i];
                    distinctWords[i] = distinctWords[j];
                    distinctWords[j] = temp;
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
