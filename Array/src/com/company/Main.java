/*
 * Classname Main
 *
 * Array Practice
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 *   1. Find in the net and download a text version of a novel about Harry Potter.  For instance,  "Harry Potter and the Sorcerer's Stone".
 *   2. Split the novel into an array of words.
 *   3. Clean the words from a punctuation signs.
 *   4. Create another array containing distinct words.
 *   5. Order the words in alphabetic order.
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
        
        //Getting array of distinct words
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
