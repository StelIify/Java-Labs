/**
 * @author Oleksandr Zorenko KNUTE
 * @version 23.06.2020
 *
 * Classname Main
 *  Final Testing
 *  Task description:
 *
 *  1.1. Download a text about Harry Potter.
 *
 *  1.2. For each distinct word in the text calculate the number of occurrence.
 *
 *  1.3. Use RegEx..
 *
 *  1.4. Sort in the DESC mode by the number of occurrence..
 *
 *  1.5. Find  the first 20 pairs.
 *
 *  1.6  Find all the proper names
 *
 *  1.7.  Count them and arrange in alphabetic order.
 *
 *  1.8.   First 20 pairs and names write into to a file test.txt
 *
 *  1.9.  Create a fine header for the file
 *
 *  1.10  Use Java  Collections to demonstrate your experience (Map, List )
 **/

package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main
{
    //File to which we are going to write
    final static String outputFilePath = "C:\\Users\\StelLify\\Desktop\\test.txt";

    public static void main(String[] args) throws IOException
    {
        // get text from the file
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\StelLify\\Desktop\\harry.txt")));

        // get all words from the text
        String[] allWords = text
                .replaceAll("[\\s\\.\\?\\!,\\-\":;]+", " ")
                .split("\\s+");

        // create String which will contain distinct words
        String uniqueWords = "";

        for (String word : allWords)
        {
            if (!uniqueWords.contains(word))
            {
                uniqueWords += word + " ";
            }
        }

        // Convert string to array splitting it by spaces
        String[] uniqueWordsArray = uniqueWords.split(" ");

        //For each distinct word in the text calculate the number of occurrence.
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: allWords)
        {
            if (wordCount.containsKey(word))
            {
                // Map already contains the word key. Just increment it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {

                // Map doesn't have mapping for word. Add one with count = 1
                wordCount.put(word, 1);
            }
        }

        for (Entry<String, Integer> entry: wordCount.entrySet())
        {
            System.out.println("Count of : " + entry.getKey() +
                    " in sentence = " + entry.getValue());
        }

        //Sort in the DESC mode by the number of occurrence.
        final Map<String, Integer> sortedByCount = wordCount.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByCount);

        //Writing to a file 20 pairs
        File file = new File(outputFilePath);

        BufferedWriter bf = null;;

        try{
            //create new BufferedWriter for the output file
            bf = new BufferedWriter( new FileWriter(file) );

            //iterate map entries
            for(int i =0; i<20;i++)
            {
                for (Entry<String, Integer> entry : sortedByCount.entrySet())
                {
                    //put key and value separated by a colon
                    bf.write(entry.getKey() + ":" + entry.getValue());

                    //new line
                    bf.newLine();
                }
                bf.flush();
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                bf.close();
            }
            catch(Exception e){}
        }

        //Find all the proper names and writing them to a file
        List<String> names = new ArrayList<>();
        int count = 0;

        Pattern p = Pattern.compile("\\b[A-Z][a-z]{3,}\\b");
        Matcher m = p.matcher(text);
        while (m.find() && count < 20)
        {
            String word = m.group();
            names.add(word);
            count++;
        }

        String namesToWrite = "";
        for(String name : names)
        {
            namesToWrite += name + System.lineSeparator();
        }

        Path path = Paths.get("C:\\Users\\StelLify\\Desktop\\test.txt");
        Files.write(path, namesToWrite.getBytes());


    }
}
